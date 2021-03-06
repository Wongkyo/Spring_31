package com.iu.s3.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s3.board.BoardDAO;
import com.iu.s3.board.BoardDTO;
import com.iu.s3.util.Pager;
import com.iu.s3.util.Pager_backup;

@Repository
public class QnaDAO implements BoardDAO{
	
	public int setReplyUpdate(QnaDTO qnaDTO)throws Exception{
	   return sqlSession.update(NAMESPACE+"setReplyUpdate", qnaDTO);
	}
	   
	public int setReply(QnaDTO qnaDTO)throws Exception{
	    return sqlSession.insert(NAMESPACE+"setReply", qnaDTO);
	}

	
	@Override //List
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}

	@Override //ToatalCount
	public long getTotalCount(Pager pager) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getTotalCount", pager);
	}

	@Override //Select
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getSelect", boardDTO);
	}

	@Override //Hit Update
	public int setHitUpdate(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.update(NAMESPACE+"setHitUpdate", boardDTO);
	}

	   @Override //Insert
	   public int setInsert(BoardDTO boardDTO) throws Exception {
	     
	      return sqlSession.insert(NAMESPACE+"setInsert", boardDTO);
	   }


	@Override //Update
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.update(NAMESPACE+"setUpdate", boardDTO);
	}

	@Override//Delete
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"setDelete", boardDTO);
	}
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.board.qna.QnaDAO.";
	
	

}
