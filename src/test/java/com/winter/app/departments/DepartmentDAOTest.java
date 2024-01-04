package com.winter.app.departments;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class DepartmentDAOTest  extends MyTest{
	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Test
	public void getListTest() {
		List<DepartmentDTO> ar = departmentDAO.getList();
		assertNotEquals(0, ar.size());
		
	}
	@Test
	public void getdatilTest()throws Exception {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(1);
		assertNotNull(departmentDTO);
	}
	
}
