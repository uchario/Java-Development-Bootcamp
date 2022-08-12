import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership() {
        this.cars = new Car[3];
        System.out.println(Arrays.toString(this.cars));
    }

    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public String search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget) {
                return "\nWe found one in spot " + i 
                        + "\n" + this.cars[i].toString() 
                        + "\nAre you interested?";
            }
            
        }
        return "Sorry, we couldn't find any cars.";
    }
}