package hib.model;


import org.thymeleaf.expression.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private  String model;
    private int series;
    private int price;
    public static Car car = new Car("Geely",11,500);

    public static Car car1 = new Car("Honda",22,550);
    public static Car car2 = new Car("Porshe",33,600);
    public static Car car3 = new Car("Tayota",44,650);
    public static Car car4 = new Car("Kia", 55,700);
    public static  List<Car> cars = new ArrayList<>(5);
    public static  List<Car> getCars (){
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        return cars;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return  model +
                series +
                price;

    }

    public static void main(String[] args) {
        System.out.println(car4);

    }

    public Car(String model, int series, int price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
