package web.controller;

import Model.Car;
import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import static Model.Car.cars;

@Controller
public class CarController {
    CarServiceImpl carService = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String carList (@RequestParam(value = "count",defaultValue = "5") int count,
                              Model model) {

        model.addAttribute("car",carService.getCar(count));
        return "cars";
    }
}
