package com.iu.s3.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;

public class NoticeDAOTest extends MyAbstractTest {

   @Autowired
   private NoticeDAO noticeDAO;
   
   @Test
   public void getListTest()throws Exception{
      List<NoticeDTO> ar = noticeDAO.getList();
      assertNotEquals(0, ar.size());
   }
   
   @Test
   public void getSelectTest()throws Exception{
      NoticeDTO noticeDTO = new NoticeDTO();
      noticeDTO.setNum(1);
      noticeDTO.setTitle("t1");
      noticeDTO.setWriter("iu");
      noticeDTO.setContents("롤린");
      noticeDTO.setHit(1);
      noticeDTO.setRegdate(null);
      
   }

}