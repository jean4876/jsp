package kr.or.ddit.prod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.prod.model.prodVO;


public class ProdDaoTest {

   /**
    *
    * Method : getProdListTest
    * 작성자 : PC-11
    * 변경이력 :
    * Method 설명 : getProdList 테스트
    */
   @Test
   public void getProdListTest() {

      /***Given***/
      IProdDao prodDao = new ProdDaoImpl();
      String lprodGu = "P101";
      /***When***/
      List<prodVO> prodList = prodDao.selectLProdList(lprodGu);

      /***Then***/
      assertEquals(6, prodList.size());

   }

}