package com.iu.s3.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class fileManager {
	
	public void saveUseTransfer(MultipartFile multipartFile, File file)throws Exception{
		multipartFile.transferTo(file);
	}
	
	public void saveUseCopy(MultipartFile multipartFile, File file)throws Exception{
		FileCopyUtils.copy(multipartFile.getBytes(), file);
	}
	
	
	public String makeUUIDFileName()throws Exception{
		return UUID.randomUUID().toString();
	}
	
	public String makeTimeFileName()throws Exception{
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
		return String.valueOf(time);
	}
	
	public File makePath(HttpSession session)throws Exception{
		//1. 저장할 폴더 지정 /resources/upload/member
		//2. os에서 인식 할 수 있는 실제 경로 찾기
		// jsp : application - server : ServletContext
		String path = session.getServletContext().getRealPath("resources/upload/member");
		System.out.println(path);
				
		//3. 실제 경로에 폴더가 없으면 파일 저장시 에러 발생 
		File file = new File(path);
				
			if(!file.exists()) {
				file.mkdir();
				}
	
	return file;
	
	}
	
	
}
