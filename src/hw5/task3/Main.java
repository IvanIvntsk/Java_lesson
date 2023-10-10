package hw5.task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Audi", 200, new Driver("Kokos1", 4,4),2000, 2020),
                new Car("BMW", 220, new Driver("Kokos2", 20,10),1500, 2002),
                new Car("Mercedes", 250, new Driver("Kokos3", 27,2),2700, 2023),
                new Car("Skoda", 140, new Driver("Kokos4", 44,9),1900, 2009),
                new Car("Toyota", 110, new Driver("Kokos5", 43,5),100, 2005)
        );

        for (int i = 0; i < cars.size()/2; i++) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() + car.getEnginePower()*0.1);
        }
        System.out.println(cars);

        cars.stream().filter(car -> car.getOwner().getAge()>25&&car.getOwner().getDrivingExperience()<5)
                .forEach(car -> car.getOwner().setDrivingExperience(car.getOwner().getDrivingExperience()+1));

        System.out.println(cars);

        Double reduce = cars.stream().map(Car::getPrice).reduce((double) 0, Double::sum);
        System.out.println(reduce);
    }
}
