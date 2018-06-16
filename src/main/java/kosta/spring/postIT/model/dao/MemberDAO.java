package kosta.spring.postIT.model.dao;

import kosta.spring.postIT.model.dto.ApplicantDTO;
import kosta.spring.postIT.model.dto.InterestedDTO;
import kosta.spring.postIT.model.dto.MenteeDTO;

public interface MemberDAO {
	
	/**
	 * ȸ�����Խ� ����/��Ƽ�� �����ϱ� ��� insertMentee�� ����(������ ������ ����� �±��ϱ⶧����)
	 */
	int insertMentee(MenteeDTO menteeDTO);
	
	/**
	 * ��Ƽ�� ���Խ� ���ɺо� �߰�
	 */	
	int insertMenteeInter(InterestedDTO interestedDTO);
	
	/**
	 * ȸ�����Խ� id �ߺ�üũ
	 */	
	int idcheck(String userId);
	
	/**
	 * ����� ���Խ� �ַºо� �߰�
	 */	
	int insertMento(ApplicantDTO applicantDTO);
	
	/**
	 * ���Ѻο�
	 */	
	int insertAuthority(String userId);
	
	/**
	 * �α��ν� ���
	 */	
	MenteeDTO selectMemberById(String userId);
	

}
