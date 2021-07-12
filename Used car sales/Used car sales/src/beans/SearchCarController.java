package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import dao.CarDaoService;
import models.Car;

@Controller
@SessionAttributes("ssn")
public class SearchCarController {
	@Autowired
	CarDaoService dao;
   @Autowired
	Car car;
   @RequestMapping("findcar")
	public Car searchCar()
{
	return new Car();
}
   @RequestMapping("search")
  public String searchCars(@RequestParam("id")int id,Model m)
  {
	  car=dao.searchCar(id);
	  if (car!=null) {
		   return "redirect:view";
	 
	}
	  else {
		return "redirect:find-error";
	}
	   }
   @RequestMapping("view")
   public String viewCar(Model m)
   {
	   	 m.addAttribute("car",car);
	   return "viewcar";
   }
   @ExceptionHandler(Exception.class)
   @RequestMapping("find-error")
   public String viewError()
   {
	   return "view-error";
   }
}
