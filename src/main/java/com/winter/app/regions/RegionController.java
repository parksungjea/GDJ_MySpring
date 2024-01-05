package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/regions/*")
public class RegionController {
	@Autowired
	private RegionsService regionsService;
	
//	public RegionController() {
//		this.regionDAO = new RegionDAO();
//	}
	
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(RegionDTO regionDTO, Model model) throws Exception {
		  regionsService.add(regionDTO);

		
		

		
		int result = this.regionsService.add(regionDTO);
		
		String msg="등록 실패";
		if(result>0) {
			msg = "등록 성공";
		}
		
		model.addAttribute("add", result);
		
		//request.setAttribute("msg", msg);
		//request.setAttribute("path", "./list");
		
		
		return "commons/result";
	}
	
//	@RequestMapping(value = "add", method = RequestMethod.GET)
//	public String add() {
//		
//		// /WEB-INF/views/   .jsp
//		return "regions/add";
//	}
	
	@RequestMapping(value ="detail", method = RequestMethod.GET)
	public String detail(RegionDTO regionDTO, Model model)throws Exception{
		
		regionDTO = regionsService.detail(regionDTO);
		model.addAttribute("detail", regionDTO);
	
		
		return "regions/detail";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(RegionDTO regionDTO, Model Model) throws Exception {
		
		List<RegionDTO> ar = regionsService.getList();
		
		Model.addAttribute("list", ar);
		
		return "regions/list";
	}

}
