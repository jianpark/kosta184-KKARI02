package kosta.spring.postIT.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kosta.spring.postIT.model.dao.CourseDAO;
import kosta.spring.postIT.model.dto.CourseDTO;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	public CourseDTO courseDetail(String couseCode) {
				
		return courseDAO.courseDetail(couseCode);
	}

	@Override
	public String courseFav(String userId) {
		
		int count=courseDAO.courseFav(userId);
		return (count==0) ? "ok":"fail"; 

	}

}
