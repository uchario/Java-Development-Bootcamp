import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "blue");
        Car car1 = new Car(car);
        Car car2 = new Car("Honda", "matted");
        //car1.setMake("Benz");
        Scanner scan = new Scanner(System.in);
        System.out.println(car.equals(car2));
    }

}
