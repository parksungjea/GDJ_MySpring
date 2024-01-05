package com.winter.app.regions;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class RegionDAOTest extends MyTest{
	@Autowired
	private RegionDAO regionDAO;
	

	public void DeleteTest() throws Exception{
		RegionDTO regionDTO = new RegionDTO() ;
		regionDTO.setRegion_id(10);
		 int a = regionDAO.Delete(regionDTO);
		 assertEquals(1, a);
	}
	
	
	public void updateTest() throws Exception{
	RegionDTO regionDTO = new RegionDTO();
	regionDTO.setRegion_id(11);
	regionDTO.setRegion_name("sungjea");
		int a = regionDAO.update(regionDTO);
	 assertEquals(1, a);
	}
	

	
	public void addTest() throws Exception {
		RegionDTO regionDTO = new RegionDTO();
		regionDTO.setRegion_name("test");
		int result = regionDAO.add(regionDTO);
		System.out.println(regionDTO.getRegion_name());
		
		assertEquals(1, result);
		
	}
	
	
	
	public void getListTest() throws Exception{
		List<RegionDTO> ar = regionDAO.getList();
		assertEquals(0, ar.size());
	}
	
	
	

	public void getDetailTest() throws Exception{
		RegionDTO regionDTO = new RegionDTO();
		regionDTO.setRegion_id(1);
		regionDTO = regionDAO.getDetail(regionDTO);
	
		assertNotNull(regionDTO);
	
	}
}
