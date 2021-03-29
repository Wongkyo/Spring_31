package com.iu.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s3.util.Pager;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int setUpdate(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setDelete(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setDelete(bankBookDTO);
	}
	
	public List<BankBookDTO> getList(Pager pager)throws Exception{
		int perPage=10;
		int perBlock=5;
		
		long startRow = (pager.getCurPage()-1)*perPage+1;
		long lastRow = pager.getCurPage()*perPage;
		
		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		
		long totalCount=bankBookDAO.getTotalCount();
		
		long totalPage= totalCount/perPage;
		if(totalCount%perPage !=0) {
			totalPage++;
		}
		
		long totalBlock = totalPage / perBlock;
		if(totalPage%5 != 0) {
			totalBlock++;
		}
		
		long curBlock = pager.getCurPage()/perBlock;
		if(pager.getCurPage()%perBlock != 0) {
			curBlock++;
		}
		
		long startNum = (curBlock-1)*perBlock+1;
		long lastNum = curBlock*perBlock;
		
		pager.setStartNum(startNum);
		pager.setLastNum(lastNum);
		
		
		return bankBookDAO.getList(pager);
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("select service");
		return bankBookDAO.getSelect(bankBookDTO);
	}

}
