package com.care.di_ex04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/red")
public class RedirectController {
	@RequestMapping("index")
	public String index() {
		return "red/index";
	}
	@RequestMapping("result")
	public String result(HttpServletRequest req) {
		String id = req.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:rsOk";
		}
		return "redirect:rsNo";
	}
	@RequestMapping("rsOk")
	public String resultOk() { return "red/rsOk"; }
	@RequestMapping("rsNo")
	public String resultNo() { return "red/rsNo"; }
}
