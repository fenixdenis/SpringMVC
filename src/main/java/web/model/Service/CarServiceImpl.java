package web.model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

import static web.model.Car.cars;

@Component
public class CarServiceImpl implements CarService {

    public List<Car> getCars(int count){
        if (count <= 0) {
            return new ArrayList<>();
        }
        if (count > cars.size()) {
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, count));
    }
}

