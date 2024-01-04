package com.winter.app.regions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.RGBColor;
@Service
public class RegionsService {
	@Autowired
	private RegionDAO regionDAO;
	
	
	public List<RegionDTO> getList() throws Exception{
		List<RegionDTO> ar = this.regionDAO.getList();
		
		return ar;
	}
}
