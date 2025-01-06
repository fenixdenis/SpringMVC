package web.model.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;


public interface CarService {

    List<Car> getCars(int count);
}
