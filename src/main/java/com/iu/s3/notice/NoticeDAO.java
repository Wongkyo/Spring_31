package com.iu.s3.notice;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s3.util.Pager;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.notice.NoticeDAO.";

	public Long getTotalCount(Pager pager)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getTotalCount", pager);
	}
	
	public int setInsert(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert", noticeDTO);
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO)throws Exception{
		noticeDTO= sqlSession.selectOne(NAMESPACE+"getSelect", noticeDTO);
		return noticeDTO;
	}

	public List<NoticeDTO> getList(Pager pager)throws Exception{
	
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setUpdate", noticeDTO);
	}
	
	public int setDelete(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setDelete", noticeDTO);
	}
}