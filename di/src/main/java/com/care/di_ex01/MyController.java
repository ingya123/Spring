package com.care.di_ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("index")
	public String index(Model model) {
		String name="이름";
		model.addAttribute("n",name);
		model.addAttribute("index","기본페이지 입니다.");
		return "member/index";
	}
	@RequestMapping(value="login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login","로그인페이지 입니다");
		mv.setViewName("member/login");
		return mv;
	}
	@RequestMapping("logout")
	public String logout() {
		return "member/logout";
	}
}
