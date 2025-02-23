package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carList;

    public CarDaoImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "X3", 2021));
        carList.add(new Car("AUDI", "A6", 2019));
        carList.add(new Car("Honda", "Accord", 2013));
        carList.add(new Car("Lada", "Granta", 2017));
        carList.add(new Car("Toyota", "Camry", 2018));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return new ArrayList<>();
        }
        if (count > carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}