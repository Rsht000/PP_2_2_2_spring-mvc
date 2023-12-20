package Service;

import Model.Car;

import java.util.List;

public class CarServiceImpl implements  CarService {
    @Override
    public List<Car> getCar(int count) {
        if (count > 5 ) {
            return Car.getCars().stream().limit(5).toList();
        }
        return Car.getCars().stream().limit(count).toList();
    }
}
