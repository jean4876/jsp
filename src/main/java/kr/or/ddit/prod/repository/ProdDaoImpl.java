
package kr.or.ddit.prod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.prod.model.prodVO;
import kr.or.ddit.util.MybatisUtil;

public class ProdDaoImpl implements IProdDao {

	@Override
	public List<prodVO> selectLProdList(String LprodLgu) {
		SqlSession sqlSession = MybatisUtil.getSession();
		List<prodVO> prodList = sqlSession.selectList("prod.selectLProdList",LprodLgu);
		sqlSession.close();
		return prodList;
	}

}
