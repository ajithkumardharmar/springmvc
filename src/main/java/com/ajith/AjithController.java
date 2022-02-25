package com.ajith;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public  class AjithController  {




	@RequestMapping("ajith")
	public ModelAndView handleReque(HttpServletRequest req, HttpServletResponse res)     {
	
		String name=req.getParameter("n1");
		String name2=req.getParameter("n2");
		String sum=name+name2;
		Map map=new HashMap();
		map.put("msg", "hi....."+name);
		ModelAndView modelAndView=new ModelAndView("success.jsp",map);
		modelAndView.addObject("result",sum);	
	
		return modelAndView;
	}




}
