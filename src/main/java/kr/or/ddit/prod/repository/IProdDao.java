package kr.or.ddit.prod.repository;

import java.util.List;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.prod.model.prodVO;

public interface IProdDao {

	List<prodVO> selectLProdList(String LprodLgu);
}
