package com.iu.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s3.util.Pager_backup;

@Controller
@RequestMapping("/bankbook/**")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping("bankbookUpdate")
	public void setUpdate(BankBookDTO bankBookDTO, Model model)throws Exception{
		
		bankBookDTO= bankBookService.getSelect(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
		
	}
	
	@RequestMapping(value="bankbookUpdate", method = RequestMethod.POST)
	public String setUpdate(BankBookDTO bankBookDTO)throws Exception{
		 int result = bankBookService.setUpdate(bankBookDTO);
		 return "redirect:./bankbookList";
	}
	
	@RequestMapping("bankbookDelete")
	public String setDelete(BankBookDTO bankBookDTO)throws Exception{
		System.out.println("Delete");
		System.out.println(bankBookDTO.getBookNumber());
		int result = bankBookService.setDelete(bankBookDTO);
		System.out.println(result);
		
		return "redirect:./bankbookList";
	}
	
	@RequestMapping("bankbookList")
	public ModelAndView getList(Pager_backup pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BankBookDTO> ar = bankBookService.getList(pager);
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");
		mv.addObject("pager", pager);
		return mv;
	
	}
	
	@RequestMapping(value = "bankbookSelect")
	public ModelAndView getSelect(BankBookDTO bankBookDTO)throws Exception{
		System.out.println("SELECT~~~");
		System.out.println(bankBookDTO.getBookNumber());
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getSelect(bankBookDTO);
		System.out.println("servie 끝");
		mv.addObject("dto", bankBookDTO);
		mv.setViewName("bankbook/bankbookSelect");
		return mv;
	}

}






