package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        try {
            model.addAttribute("cars", carService.getCars(Integer.parseInt(count)));
        } catch (NumberFormatException e) {
            model.addAttribute("cars", carService.getCars(5));
        }

        return "cars";

    }
}
