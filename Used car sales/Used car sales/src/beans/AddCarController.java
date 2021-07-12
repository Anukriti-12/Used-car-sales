package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CarDaoService;
import models.Car;
import myvalidators.AddCarValidation;

@Controller
@ComponentScan({"myvalidators"})
public class AddCarController {
	@Autowired
	CarDaoService dao;
   @RequestMapping("addcar")
public Car addCar()
{
return new Car();	   
}
   @Autowired
   private AddCarValidation val;
   @InitBinder
   public void addMyValidator(WebDataBinder wdb)
   {
	   
	   wdb.setValidator(val);
   }
   
   @RequestMapping("add")
 public String addCarToDB(@Validated Car car,BindingResult br,Model m)
 {
	   if (br.hasErrors()) {
		return "addcar";
	}
	   
	 int i=dao.addCar(car);
	 if (i>0) {
		return "addcar";
	}
	 else {
		return "redirect:addcar-error";
	}
 }
   @ExceptionHandler(Exception.class)
   @RequestMapping("addcar-error")
   public String addCarError()
   {
	   return "addcar-err";
   }
   
}
