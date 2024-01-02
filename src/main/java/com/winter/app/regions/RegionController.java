package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/regions/*")
public class RegionController {
	
	
	@RequestMapping(value ="detail", method = RequestMethod.GET)
	public String detail(HttpServletRequest request)throws Exception{
		
		RegionDAO regionDAO = new RegionDAO();
		RegionDTO regionDTO = new RegionDTO();
		String id = request.getParameter("region_id");
		
		regionDTO.setRegion_id(Integer.parseInt(id));
		
		regionDTO = regionDAO.getDetail(regionDTO);
		
		request.setAttribute("dto", regionDTO);
		
		return "regions/detail";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(HttpServletRequest request) throws Exception {
		System.out.println("Regions List");
		RegionDAO regionDAO = new RegionDAO();
		List<RegionDTO> ar = regionDAO.getList();
		
		request.setAttribute("list", ar);
		
		return "regions/list";
	}

}
