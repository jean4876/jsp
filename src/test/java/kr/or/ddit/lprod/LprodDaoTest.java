package kr.or.ddit.lprod;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.repository.LprodDaoImpl;

public class LprodDaoTest {



	@Test
	public void selectAllLprodList() {

		/***Given***/
		LprodDaoImpl lprodDao = new LprodDaoImpl();

		/***When***/
		List<LprodVO> list = lprodDao.selectAllLprodList();

		/***Then***/
		assertEquals(9, list.size());
	}

}
