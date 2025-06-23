package design.practice.iterator;

import design.practice.Car;
import design.practice.ParkingLot;

import java.util.NoSuchElementException;

public class ParkingLotIterator implements PracticeIterator<Car> {

    private ParkingLot parkingLot;
    private int index;

    public ParkingLotIterator(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        if (parkingLot.getLast().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Car next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Car car = parkingLot.getCarAt(index);
        index++;
        return car;
    }
}
