package com.skilldistillery.jpafishtankwatertest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(path = {"addTest.do"}, method = RequestMethod.POST)
	public String addTest(FishTankWaterTest newTest, Model model) {
		model.addAttribute("fishTankWaterTests", tankDao.findAll());
		newTest = tankDao.create(newTest);
		return "index";
	}
	
	@RequestMapping(path= {"createPage.do"})
	public String create(Model model ) {
		return "test/addTest";
	}
	
	@RequestMapping(path= {"delete.do"})
	public String deleteTest(Integer id, Model model) {
		boolean deleted = tankDao.deleteById(id);
		model.addAttribute("FishTankWaterTest", deleted);
		return "test/delete";
	}
	@RequestMapping(path= {"deleteTestConfirmation.do"}, method = RequestMethod.GET)
	public ModelAndView removeInShowTest(int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("FishTankWaterTest", tankDao.findById(id));
		mv.setViewName("test/deleteTestConfirmation");
		return mv;
	}
	
	
	

}
