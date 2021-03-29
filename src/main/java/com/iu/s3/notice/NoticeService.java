package com.iu.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s3.util.Pager;

@Service
public class NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getList(long curPage)throws Exception{
		Pager pager = new Pager();
		long perPage=10;
		pager.setStartRow((curPage)*perPage+1);
		pager.setLastRow(curPage*perPage);
		return noticeDAO.getList(pager);
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.getSelect(noticeDTO);
	}
	
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setUpdate(noticeDTO);
	}
	
	public int setDelete(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setDelete(noticeDTO);
	}
	
	public int setInsert(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setInsert(noticeDTO);
	}
	
	
}
