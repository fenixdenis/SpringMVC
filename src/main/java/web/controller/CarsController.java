package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.model.Service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCars(HttpServletRequest request, ModelMap model) {

        List<Car> cars = carService.getCars(5);
        String count = request.getParameter("count");
        if (count != null) {
            int countCar = Integer.parseInt(count);
            cars = carService.getCars(countCar);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}





