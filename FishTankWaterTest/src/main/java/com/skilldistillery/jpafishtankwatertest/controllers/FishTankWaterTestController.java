package com.skilldistillery.jpafishtankwatertest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jpafishtankwatertest.data.FishTankDAO;

@Controller
public class FishTankWaterTestController {
	
	@Autowired
	private FishTankDAO tankDao;
	
	@RequestMapping(path = {"/", "index.do"}) //could also rename this home
	public String index(Model model) {
		model.addAttribute("fishTankWaterTests", tankDao.findAll());
		return "index";
	}

}
