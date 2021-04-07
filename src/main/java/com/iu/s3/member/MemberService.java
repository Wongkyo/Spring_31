package com.iu.s3.member;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public int memberUpdate(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberUpdate(memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberDelete(memberDTO);
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberLogin(memberDTO);
	}
												//이진데이터
	public int memberJoin(MemberDTO memberDTO,MultipartFile avatar, HttpSession session)throws Exception{
			//makePath()
			
			
			
			//5. HDD에 파일 저장
			//file = new File(file, name);

			//	1) FileCopyUtils 클래스의 copy 메서드 사용
			//FileCopyUtils.copy(avatar.getBytes(), file);	       
			
			//	2) MultipartFile 클래스의 메서드 사용
			file = new File(file,fileName);
			avatar.transferTo(file);
			
			
			
		return 0;
		//return memberDAO.memberJoin(memberDTO);
	}

}
