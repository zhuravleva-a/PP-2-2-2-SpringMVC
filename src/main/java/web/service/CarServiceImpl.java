package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int count) {
        return count > 5 ? Car.getCars() : Car.getCars().subList(0, count);
    }
}
