package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
//	@Autowired
//	ServletContext Application;
//	@RequestMapping("/url.php")
//	public String sayHello(HttpSession session, HttpServletRequest req,HttpServletResponse resp){
//			String fullName = req.getParameter("hoten");
//					req.setAttribute("message", "Http Components");
//					return "hello";
//	}
	@RequestMapping("/index2")
	public String index(Model model) {
		model.addAttribute("message", "Welcome to Spring MVC! Welcome to Java5 Courseas!");
		System.out.println("index2");
		return "index2";

}
}
