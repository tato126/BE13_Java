package design.practice;

import design.Iterable;
import design.Iterator;
import design.practice.iterator.ParkingLotIterator;
import design.practice.iterator.PracticeIterable;
import design.practice.iterator.PracticeIterator;

import java.util.ArrayList;

public class ParkingLot implements PracticeIterable<Car> {


    private ArrayList<Car> parkingList;

    public ParkingLot() {
        this.parkingList = new ArrayList<Car>();
    }

    public Car getCarAt(int index) {
        return parkingList.get(index);
    }

    public void appendCar(Car car) {
        this.parkingList.add(car);

        System.out.println("'" + car.getName() + "'가 리스트에 추가되었습니다.");
    }

    public ArrayList<Car> getLast() {
        return this.parkingList;
    }

    @Override
    public PracticeIterator<Car> iterator() {
        return new ParkingLotIterator(this);
    }
}
