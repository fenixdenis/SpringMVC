package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;



@Component
public class CarServiceImpl implements CarService {

    public List<Car> cars = List.of(
            new Car(1, "Tesla Model S", "Electro"),
            new Car(2, "Ford Mustang", "Dizel"),
            new Car(3, "Toyota Corolla", "Hybrid"),
            new Car(4, "Lada Kalina", "Benzin"),
            new Car(5, "Volga", "Hybrid"));

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

