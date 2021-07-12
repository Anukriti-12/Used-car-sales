package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import dao.CarDaoService;
import models.Car;

@Controller
@SessionAttributes({"mysession"})
public class UpdateCarController {
	@Autowired
	CarDaoService dao;
   @RequestMapping("updatecar")
	public ModelAndView updateCars(Car car,@RequestParam("id")int id)
{
	ModelAndView mv=new ModelAndView();
	dao.updateCar(car);
	mv.setViewName("redirect:allcars");
	return mv;
}
   
}
