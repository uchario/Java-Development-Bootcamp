public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 6000, 2021, "yellow", new String[] {"tires", "filter"})
        };

        Dealership dealership = new Dealership();

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        Car newCar = dealership.getCar(0);
        newCar.setColor("blue");
        System.out.println(newCar);
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(dealership.getCar(0));
        }
       

        Person uche = new Person("Uchechukwu Ariolu", "Nigerian", "06/11/1005", 11);

        if (uche.applyPassport()) {
            uche.setPassport();
        } else {
            System.out.println("\nWe're sorry " + uche.getName() + " We cannot process your application");
        }
    }
}