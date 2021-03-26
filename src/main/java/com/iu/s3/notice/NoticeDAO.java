package com.iu.s3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {

	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.notice.NoticeDAO.";

	public NoticeDTO getSelect(NoticeDTO noticeDTO)throws Exception{
		noticeDTO= sqlSession.selectOne(NAMESPACE+"getSelect", noticeDTO);
		return noticeDTO;
	}

	public List<NoticeDTO> getList()throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList");
	}
}