package design.practice;

import design.Iterator;
import design.practice.iterator.PracticeIterator;

public class CarMain {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();

        parkingLot.appendCar(new Car("현대 자동차"));
        parkingLot.appendCar(new Car("기아 자동차"));
        parkingLot.appendCar(new Car("해외 자동차"));

        PracticeIterator<Car> it = parkingLot.iterator();

        while (it.hasNext()) {
            Car car = it.next();
            System.out.println();
        }

        System.out.println();
    }
}
