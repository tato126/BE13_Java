import test.Bike;
import test.Car;
import test.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car = new Car("테슬라", 100);


        car.start();
        car.checkTrunkStorage();
        car.stop();
    }
}