package kosta.spring.postIT.model.service;

import kosta.spring.postIT.model.dto.ApplicantDTO;
import kosta.spring.postIT.model.dto.InterestedDTO;
import kosta.spring.postIT.model.dto.MenteeDTO;


public interface MemberService {

	/**
	 * ȸ�����Խ� ����/��Ƽ�� �����ϱ� ��� insertMentee�� ����(������ ������ ����� �±��ϱ⶧����)
	 * @param ��Ƽ�� ���� ������ menteeDTO,interestedDTO �������� ����
	 * @return �������θ� ������ controller�� �̵�
	 */
	int insertMentee(MenteeDTO menteeDTO,InterestedDTO interestedDTO);
	
	/**
	 * ����� ���Խ� �ַºо� �߰�
	 * @param ���信 ���� ������ menteeDTO,applicantDTO�������� ����
	 * @return ȸ�������� �Ǹ� ������������ �̵�
	 */	
	int insertMento(MenteeDTO menteeDTO,ApplicantDTO applicantDTO);
	
	/**
	 * ȸ�����Խ� id �ߺ�üũ
	 */	
	String idcheck(String userId);
	

}