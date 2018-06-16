package kosta.spring.postIT.model.dao;

import kosta.spring.postIT.model.dto.CourseDTO;

public interface CourseDAO {
	
	/**
	 * 스터디 상세페이지보기
	 */
	CourseDTO courseDetail(String couseCode);
	
	/**
	 * 찜하기
	 */
	int courseFav(String userId);
	

}
