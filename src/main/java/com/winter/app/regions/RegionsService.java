package com.winter.app.regions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.RGBColor;
@Service
public class RegionsService {
	@Autowired
	private RegionDAO regionDAO;
	
	
	public int delete(RegionDTO regionDTO) throws Exception {
		return regionDAO.Delete(regionDTO);
	}
	
	public int update(RegionDTO regionDTO) throws Exception{
		return regionDAO.update(regionDTO);
		
	}
	
	public int add(RegionDTO regionDTO)throws Exception {
		return regionDAO.add(regionDTO);
		
	}
	
	
	public RegionDTO detail(RegionDTO regionDTO) throws Exception{
		return regionDAO.getDetail(regionDTO);
		
	}
	
	public List<RegionDTO> getList() throws Exception{
		List<RegionDTO> ar = this.regionDAO.getList();
		
		return ar;
	}
}
