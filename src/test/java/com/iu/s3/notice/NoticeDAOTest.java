package com.iu.s3.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class NoticeDAOTest {

	@Autowired
	private NoticeDAO noticeDAO;
	
	
	
	
	@Test
	public void getSelectTest()throws Exception{
		List<NoticeDTO> ar = noticeDAO.getList();
		assertNotEquals(0, ar.size());
	}

	
	

}
