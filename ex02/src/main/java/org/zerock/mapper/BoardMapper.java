package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
	
	// BoardMapper.xml에 따로 쿼리를 작성하였기 때문에 @Select 필요 없음
//	@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	// 페이징
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	// insert만 처리되고 생성된 PK 값을 알 필요가 없는 경우
	public void insert(BoardVO board);
	
	// insert문이 실행되고 생성된 PK 값을 알아야 하는 경우
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public int getTotalCount(Criteria cri);
}
