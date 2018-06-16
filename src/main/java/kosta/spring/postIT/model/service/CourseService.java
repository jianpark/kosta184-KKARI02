package kosta.spring.postIT.model.service;

import kosta.spring.postIT.model.dto.CourseDTO;

public interface CourseService {

	/**
	 * ���͵� ������������
	 * @param String ���¹�ȣ��� ��
	 * @return CourseDTO ���͵� �󼼳��� �� ����Ұ������� ���� 
	 */
	CourseDTO courseDetail(String couseCode);
	
	/**
	 * ���ϱ�
	 */
	String courseFav(String userId);
}
