package com.example.hellospring.vo;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class RequestVo {
	
//	field
	private String name;
	private Long no;
	
//	getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "RequestVo [name=" + name + ", no=" + no + "]";
	}
	
}
