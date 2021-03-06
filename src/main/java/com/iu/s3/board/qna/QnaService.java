package com.iu.s3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s3.board.BoardDTO;
import com.iu.s3.board.BoardService;
import com.iu.s3.util.Pager;
import com.iu.s3.util.Pager_backup;

@Service
public class QnaService implements BoardService {
	
	@Autowired
	private QnaDAO qnaDAO;

	public int setReply(QnaDTO qnaDTO)throws Exception{ //SetReply
		//부모글의 ref, step, depth 조회
		BoardDTO boardDTO = qnaDAO.getSelect(qnaDTO);
		QnaDTO parent =(QnaDTO)boardDTO;
		System.out.println(parent.getRef());
		System.out.println(parent.getStep());
		System.out.println(parent.getDepth());
		
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(parent.getStep()+1);
		qnaDTO.setDepth(parent.getDepth()+1);
		
		int result = qnaDAO.setReplyUpdate(parent);
		result = qnaDAO.setReply(qnaDTO);
		
		
		return result;
	}
	
	@Override //List
	public List<BoardDTO> getList(Pager pager) throws Exception {
		//1. row
		pager.makeRow();
		
		//2. paging
		long totalCount = qnaDAO.getTotalCount(pager);
		pager.makeNum(totalCount);
		
		
		return qnaDAO.getList(pager);
	}

	@Override //Select
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		int result = qnaDAO.setHitUpdate(boardDTO);
		return qnaDAO.getSelect(boardDTO);
	}

	@Override //Insert
	public int setInsert(BoardDTO boardDTO) throws Exception {
	
		return qnaDAO.setInsert(boardDTO);
	}

	@Override //Update
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return qnaDAO.setUpdate(boardDTO);
	}

	@Override //Delete
	public int setDelete(BoardDTO boardDTO) throws Exception {
	
		return qnaDAO.setDelete(boardDTO);
	}
	
	
	
	
}