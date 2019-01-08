package com.umindang.comike.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//main페이지 리턴
	@RequestMapping(value = "/main")
	public String main(Model model) {
		return "/main";
	}
}
