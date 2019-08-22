package kr.or.ddit.lprod.repository;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.util.MybatisUtil;

public class LprodDao implements ILprodDao {

	@Override
	public List<LprodVO> selectAllLprodList(SqlSession sqlSession) {

		return sqlSession.selectList("lprod.selectAllLprodList");
	}

	@Override
	public List<LprodVO> getLprodPagingList(SqlSession sqlSession,Page page){
		return sqlSession.selectList("lprod.getLprodPagingList",page);
	}

	@Override
	public int getLprodTotalCnt(SqlSession sqlSession){
		return sqlSession.selectOne("lprod.getLprodTotalCnt");
	}





}
