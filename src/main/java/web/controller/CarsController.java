package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(name = "count", defaultValue = "0") Integer count, ModelMap model) {
        List<Car> carList;
        if (count > 0 && count < 5) {
            carList = carService.getCarList().subList(0, count);
        } else {
            carList = carService.getCarList();
        }
        model.addAttribute("carstable", carList);
        return "car";
    }

}
