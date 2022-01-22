package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, HttpServletRequest request) {
        CarService carService = new CarServiceImpl();
        if (request.getParameter("count") != null) {
            model.addAttribute("cars", carService.getCars(Integer.parseInt(request.getParameter("count"))));
        } else {
            model.addAttribute("cars", carService.getCars(5));
        }

        return "cars";

    }
}
