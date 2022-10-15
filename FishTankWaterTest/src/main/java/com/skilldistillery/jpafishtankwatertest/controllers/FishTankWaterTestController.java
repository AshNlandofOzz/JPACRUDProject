package com.skilldistillery.jpafishtankwatertest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jpafishtankwatertest.data.FishTankDAO;
import com.skilldistillery.jpafishtankwatertest.entities.FishTankWaterTest;

@Controller
public class FishTankWaterTestController {
	
	@Autowired
	private FishTankDAO tankDao;
	
	@RequestMapping(path = {"/", "index.do"}) //could also rename this home
	public String index(Model model) {
		model.addAttribute("fishTankWaterTests", tankDao.findAll());
		return "index";
	}
	
	@RequestMapping(path= {"showTest.do"})
	public String showTest(Integer id, Model model) {
		FishTankWaterTest test = tankDao.findById(id);
		model.addAttribute("FishTankWaterTest", test);
		return "test/showTest";
	}

}
