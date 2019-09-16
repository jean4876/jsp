package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVO;


public interface ILprodDao {

	List<LprodVO> selectAllLprodList(SqlSession sqlSession);

	List<LprodVO> getLprodPagingList(SqlSession sqlSession, Page page);

	int getLprodTotalCnt(SqlSession sqlSession);


}
