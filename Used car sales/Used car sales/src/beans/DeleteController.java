package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.CarDaoService;

@Controller
public class DeleteController {
	@Autowired
	CarDaoService dao;
    @RequestMapping("deleteuser")
	public String deleteUser(@RequestParam("id")int id)
{
    	dao.deleteCar(id);
    	return "redirect:allcars";
}
}
