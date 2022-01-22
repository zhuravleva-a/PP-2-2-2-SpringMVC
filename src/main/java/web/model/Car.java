package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private long id;
    private String model;
    private String series;
    private static List<Car> cars;

    public Car() {

    }

    public Car(long id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public static List<Car> getCars() {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "BMW", "X6"));
        cars.add(new Car(2L, "Mercedes", "S"));
        cars.add(new Car(3L, "Audi", "A6"));
        cars.add(new Car(4L, "Toyota", "Corolla"));
        cars.add(new Car(5L, "KIA", "RIO"));
        return cars;
    }

    public String getModel() {
        return model;
    }

    public long getId() {
        return id;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
