package kosta.spring.postIT.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kosta.spring.postIT.model.dto.CourseDTO;
import kosta.spring.postIT.model.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping("/course/detail")
	public ModelAndView courseDetail(String courseCode, String userId) {
		
		ModelAndView mv = new ModelAndView();	
		
		//test용
		courseCode="c0002";
		CourseDTO courseDTO = courseService.courseDetail(courseCode);				
		mv.addObject("courseDTO", courseDTO);
		
		//찜하기
		if(userId!=null) {
			String courseFav = courseService.courseFav(userId);
			mv.addObject("courseFav", courseFav);
		}
		mv.setViewName("common/courese/courseDetail"); // WEB-INF/views/common/course/courseDetail.jsp이동
		return mv;
		
	}
	
	@RequestMapping("course/favChange")
	@ResponseBody
	public String favChange(HttpServletRequest request) {
		
		System.out.println("id : "+request.getParameter("id"));
		
		return "";
		//return memberService.idcheck(request.getParameter("id"));
	}
	
	
	
	
	
	
}
