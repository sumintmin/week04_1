package auto;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("red", 2, 0);
        car2.changeGear();
        Car car3 = new Car("Hyundai","GV90", "black", 1, 0 );
        car3.changeGear(7);
        car3.speedUp();
        car3.speedUp();
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
    }
}
