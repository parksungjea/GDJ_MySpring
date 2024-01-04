package com.winter.app.departments;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {

		@Autowired
		private SqlSession sqlSession;
		private String namespace="com.winter.app.departments.DepartmentDAO.";
	
	public List<DepartmentDTO> getList() {
				return sqlSession.selectList(namespace+"getList");
	}
		
	
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO) throws Exception{
				return sqlSession.selectOne(namespace+"getdetail", departmentDTO);
		
	}
	
}
