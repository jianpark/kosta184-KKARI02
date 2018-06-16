package kosta.spring.postIT.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosta.spring.postIT.model.dto.CourseDTO;

@Repository
public class CourseDAOImpl implements CourseDAO {
	
	@Autowired
	private SqlSession session;

	@Override
	public CourseDTO courseDetail(String couseCode) {

		return session.selectOne("courseMapper.courseDetailAssociation", couseCode);
	}

	@Override
	public int courseFav(String userId) {
		
		return session.selectOne("courseMapper.courseFav", userId);
	}
	
	

}
