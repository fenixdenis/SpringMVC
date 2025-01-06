package web.model;


import java.util.ArrayList;
import java.util.List;

public class Car {
    private int id;
    private String name;
    private String type;

    public static List<Car> cars = List.of(
        new Car(1, "Tesla Model S", "Electro"),
        new Car(2, "Ford Mustang", "Dizel"),
        new Car(3, "Toyota Corolla", "Hybrid"),
        new Car(4, "Lada Kalina", "Benzin"),
        new Car(5, "Volga", "Hybrid"));

    public Car(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}