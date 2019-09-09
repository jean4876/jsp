package kr.or.ddit.mvc.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.mvc.model.UrlMapping;

public class UrlMappingDaotest {
	private static final Logger logger = LoggerFactory.getLogger(UrlMappingDaotest.class);



	@Test
	public void getUrlMappingtest() {

		/***Given***/
		IUrlMappingDao dao = new UrlMappingDao();

		/***When***/
		List<UrlMapping> list = dao.getUrlMapping();
		logger.debug("list : {}", list);

		/***Then***/
		assertEquals(2, list.size());


	}

}
