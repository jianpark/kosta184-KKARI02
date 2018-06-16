package kosta.spring.postIT.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kosta.spring.postIT.model.dao.AuthoritiesDAO;
import kosta.spring.postIT.model.dao.MemberDAO;
import kosta.spring.postIT.model.dto.ApplicantDTO;
import kosta.spring.postIT.model.dto.AuthorityDTO;
import kosta.spring.postIT.model.dto.InterestedDTO;
import kosta.spring.postIT.model.dto.MenteeDTO;
import kosta.spring.postIT.model.util.RoleConstants;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
    private PasswordEncoder passworEncoder;
	
	@Autowired
	private AuthoritiesDAO authDAO;
	

	@Override
	@Transactional
	public int insertMentee(MenteeDTO menteeDTO,InterestedDTO interestedDTO) {
		
		//��й�ȣ�� ��ȣȭ..
		menteeDTO.setUserPwd(passworEncoder.encode(menteeDTO.getUserPwd()));
		
		//member���̺� insert
		memberDAO.insertMentee(menteeDTO);
		
		//���� ���
		authDAO.insertAuthority(new AuthorityDTO(menteeDTO.getUserId(), RoleConstants.ROLE_MENTEE));
		
		//���ɺо� ���
		memberDAO.insertMenteeInter(interestedDTO);

		//�����̵� �߰� ����
		return 0;
	
	}


	@Override
	public String idcheck(String userId) {
		int count=memberDAO.idcheck(userId);
		return (count==0) ? "ok":"fail"; 
	}


	@Override
	@Transactional
	public int insertMento(MenteeDTO menteeDTO, ApplicantDTO applicantDTO) {
		
		//��й�ȣ�� ��ȣȭ..
		menteeDTO.setUserPwd(passworEncoder.encode(menteeDTO.getUserPwd()));
		
		//member���̺� insert
		memberDAO.insertMentee(menteeDTO);
		
		//���� ���
		authDAO.insertAuthority(new AuthorityDTO(menteeDTO.getUserId(), RoleConstants.ROLE_MENTEE));
		
		//���ɺо� ���
		memberDAO.insertMento(applicantDTO);
		
		//�����̵� �߰� ����
		return 0;
	}


	
	

}
