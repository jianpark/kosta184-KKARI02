package kosta.spring.postIT.model.dao;

import kosta.spring.postIT.model.dto.CourseDTO;

public interface CourseDAO {
	
	/**
	 * ���͵� ������������
	 */
	CourseDTO courseDetail(String couseCode);
	
	/**
	 * ���ϱ�
	 */
	int courseFav(String userId);
	

}
