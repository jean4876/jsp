package kr.or.ddit.lprod.repository;

import java.util.List;

import kr.or.ddit.lprod.model.LprodVO;


public interface ILprodDao {

	List<LprodVO> selectAllLprodList();

}
