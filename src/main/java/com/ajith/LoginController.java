package com.ajith;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;





@RestController
public class LoginController {

//	@Autowired
//	UsersRepository usersRepo;
//
//	@Autowired
//	ProductRepository productRepo;
//
//	@Autowired
//	UserService userService;

	@GetMapping("/login")
	public ModelAndView home() {
	System.out.println("hllo");
	ModelAndView mv = new ModelAndView("index.jsp");
	return mv;
	}

	@PostMapping("/checkUser")
	public String login(@RequestParam String email, String password, HttpServletRequest request) {
//		Users userDetails = (Users) usersRepo.UserLoginCheck(email, password);
//		System.out.println(email + " " + password);
//		ModelAndView mv = userService.login(userDetails, request);
		System.out.println("hollo");
		return "hlo";
	}

}
