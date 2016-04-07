package enryPoint;

import crud.CarService;
import entity.Car;

/**
 * Created by psok on 4/7/2016.
 */
public class EntryPoint {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", 9999.99f);
        Car carFromDB = CarService.add(car1);
        System.out.println(carFromDB);
    }
}
