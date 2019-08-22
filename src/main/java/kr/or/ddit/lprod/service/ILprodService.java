package kr.or.ddit.lprod.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVO;

public interface ILprodService {

	List<LprodVO> selectAllLprodList();

	Map<String, Object> getLprodPagingList(Page page);

}
