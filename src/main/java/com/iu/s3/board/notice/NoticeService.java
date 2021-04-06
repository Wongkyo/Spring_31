package com.iu.s3.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s3.board.BoardDTO;
import com.iu.s3.board.BoardService;
import com.iu.s3.board.qna.QnaDTO;
import com.iu.s3.util.Pager;
import com.iu.s3.util.Pager_backup;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	
	
	@Override //Select
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
	
		return noticeDAO.getSelect(boardDTO);
	}



	@Override //Insert
	public int setInsert(BoardDTO boardDTO) throws Exception {
	
		return noticeDAO.setInsert(boardDTO);
	}



	@Override //Update
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return noticeDAO.setUpdate(boardDTO);
	}



	@Override //Delete
	public int setDelete(BoardDTO boardDTO) throws Exception {

		return noticeDAO.setDelete(boardDTO);
	}


	//List
	public List<BoardDTO> getList(Pager pager)throws Exception{
		// ---- startRow, lastRow ----
		pager.makeRow();
		
		// ---- 페이징 계산 ---------------
		long totalCount = noticeDAO.getTotalCount(pager);
		pager.makeNum(totalCount);
		
		
		
		return noticeDAO.getList(pager);
	}

}
