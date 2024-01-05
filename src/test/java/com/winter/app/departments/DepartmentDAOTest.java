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
	public void DeleteTest() throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(350);
		int a = departmentDAO.Delete(departmentDTO);
		assertEquals(1, a);
	}
	
	
	public void update() throws Exception {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(350);
		departmentDTO.setDepartment_name("sungjea");
		departmentDTO.setManager_id(200);
		departmentDTO.setLocation_id(1700);
		int a = departmentDAO.update(departmentDTO);
		assertEquals(1, a);
	}
	
	
	public void addTest() throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_name("lolololo");
		departmentDTO.setManager_id(200);
		departmentDTO.setLocation_id(1700);
		 int a = departmentDAO.add(departmentDTO);
		assertEquals(1, a);
	}
	
	public void getListTest() {
		List<DepartmentDTO> ar = departmentDAO.getList();
		assertNotEquals(0, ar.size());
		
	}
	
	public void getdatilTest()throws Exception {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(1);
		assertNotNull(departmentDTO);
	}
	
}
