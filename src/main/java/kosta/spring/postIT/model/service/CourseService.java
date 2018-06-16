package kosta.spring.postIT.model.service;

import kosta.spring.postIT.model.dto.CourseDTO;

public interface CourseService {

	/**
	 * 스터디 상세페이지보기
	 * @param String 강좌번호들고 들어감
	 * @return CourseDTO 스터디 상세내용 및 강사소개가지고 나옴 
	 */
	CourseDTO courseDetail(String couseCode);
	
	/**
	 * 찜하기
	 */
	String courseFav(String userId);
}
