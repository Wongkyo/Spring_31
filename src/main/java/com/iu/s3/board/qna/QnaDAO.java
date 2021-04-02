package com.iu.s3.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s3.board.BoardDAO;
import com.iu.s3.board.BoardDTO;
import com.iu.s3.util.Pager;

@Repository
public class QnaDAO implements BoardDAO{
	
	@Override //List
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		return null;
	}

	@Override //ToatalCount
	public long getTotalCount(Pager pager) throws Exception {
		
		return 0;
	}

	@Override //Select
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		
		return null;
	}

	@Override //Hit Update
	public int setHitUpdate(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}

	@Override //Insert
	public int setInsert(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}

	@Override //Update
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}

	@Override //Delete
	public int setDelete(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.board.qna.QnaDAO.";
	
	

}
