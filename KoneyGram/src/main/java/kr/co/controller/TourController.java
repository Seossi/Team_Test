package kr.co.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.service.TourService;
import kr.co.vo.CityVO;
import kr.co.vo.TourVO;

@Controller
@RequestMapping("/tours/*")
public class TourController {
	
	private static final Logger logger = LoggerFactory.getLogger(TourController.class);
	
	@Autowired
	TourService tourservice;
	
	  @RequestMapping(value="/tour", method = RequestMethod.GET)
	  public String city(Model m) throws Exception{
		  return "tours/tour";
	  }
	  
		
		
	    @RequestMapping(value = "/makesche",method = RequestMethod.GET)
	    public String register (Model m) throws Exception {
	        return "tours/makesche";
	    }
		 
		 
	
}
