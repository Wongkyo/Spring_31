package com.iu.s3.board.notice;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s3.board.BoardDAO;
import com.iu.s3.board.BoardDTO;
import com.iu.s3.board.BoardFileDTO;
import com.iu.s3.util.Pager;
import com.iu.s3.util.Pager_backup;

@Repository
public class NoticeDAO implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.iu.s3.board.notice.NoticeDAO.";

	
	public BoardFileDTO getFileSelect(BoardFileDTO boardFileDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getFileSelect", boardFileDTO);
	}
	
	public int setFileDelete(BoardFileDTO boardFileDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"setFileDelete", boardFileDTO);
	}
	
	
	@Override  //List
	public List<BoardDTO> getList(Pager pager) throws Exception {
	
	return sqlSession.selectList(NAMESPACE+"getList", pager);
	}

	@Override //Count
	public long getTotalCount(Pager pager) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getTotalCount", pager);
	}

	@Override //Select
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getSelect", boardDTO);
	}

	@Override //HitUpdate
	public int setHitUpdate(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}

	@Override //Insert
	public int setInsert(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setInsert", boardDTO);
	}

	// GetNum
	public long getNum()throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getNum");
	}
	
	// SetFileInsert
	public int setFileInsert(BoardFileDTO boardFileDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setFileInsert", boardFileDTO);
	}
	
	
	
	@Override //Update
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.update(NAMESPACE+"setUpdate", boardDTO);
	}

	@Override //Delete
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"setDelete", boardDTO);
	}
	
	
	
}