package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{

    private final List<Car> carlist = new ArrayList<>();

    public CarServiceImpl() {
        carlist.add(new Car("bmw", 550, "n63"));
        carlist.add(new Car("bmw", 340, "b58"));
        carlist.add(new Car("bmw", 118, "n46"));
        carlist.add(new Car("bmw", 535, "m57"));
        carlist.add(new Car("bmw", 320, "b48"));
    }
    @Override
    public List<Car> getCarList() {
        return carlist;
    }

    @Override
    public int getCarCount() {
        return carlist.size();
    }


}
