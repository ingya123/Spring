package com.care.di_ex03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.member.MemberDTO;

@Controller
@RequestMapping("/member02")
public class MyController02 {
	//http://localhost:8081/di_ex01/member02/index
	@RequestMapping("/index")
	public String memberIndex() {
		
		return "/member02/index";
	}
	@RequestMapping(value="/result", 
						method=RequestMethod.GET)
	public String memberRe(HttpServletRequest req, Model model) {
		model.addAttribute("name",req.getParameter("name"));
		model.addAttribute("age",req.getParameter("age"));
		return "member02/result";
	}
	@PostMapping("/result")
	public String memberRe02(@RequestParam("name") String n,
					@RequestParam("age") String a, Model model) {
		model.addAttribute("age",a);
		model.addAttribute("name",n);
		return "member02/result";
	}
	@RequestMapping("result01")
	public String re(MemberDTO m,Model model) {
		model.addAttribute("mem",m);
		return "member02/result";
	}
}
