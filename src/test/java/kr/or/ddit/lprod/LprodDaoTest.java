package kr.or.ddit.lprod;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.repository.LprodDao;
import kr.or.ddit.lprod.service.LprodService;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserService;

public class LprodDaoTest {

	   private LprodService lprodService;

	   @Before
	   public void setup() {
		   lprodService = new LprodService();
	   }

	@Test
	public void selectAllLprodList() {

		/***Given***/


		/***When***/
		List<LprodVO> list = lprodService.selectAllLprodList();

		/***Then***/
		assertEquals(9, list.size());
	}

}
