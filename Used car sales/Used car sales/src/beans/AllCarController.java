package beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import dao.CarDaoService;
import models.Car;

@Controller
@SessionAttributes("ssn")
public class AllCarController {
	@Autowired
	CarDaoService dao;
	@Autowired
	Car car;
   @RequestMapping("allcars")
	public String showAllCars(Model m)
{
List<Car> list=dao.getAllCars();
m.addAttribute("ssn",list);
return "redirect:showallcars";
}
   @RequestMapping("showallcars")
   public String showAll()
   {
	   return "allcars";
   }
}
