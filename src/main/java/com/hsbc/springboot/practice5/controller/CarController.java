package com.hsbc.springboot.practice5.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.springboot.practice5.model.Car;

@Controller
public class CarController {
	@RequestMapping("/carList")
	public ModelAndView getcarList() {
		ArrayList<Car>carList = new ArrayList<Car>();
		Car c1 = new Car(1111, "Audi", 5000000, "Black");
		Car c2 = new Car(2222, "BMW", 4500000, "Blue");
		Car c3 = new Car(3333, "Hyundai", 2000000, "Red");
		
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		
		ModelAndView mav = new ModelAndView("carList","carList",carList);
		return mav;
	}
	@RequestMapping("/showAddCar")
	public ModelAndView getshowAddCarPage() {
		ModelAndView mav = new ModelAndView("addCar");
		return mav;
	}
}
