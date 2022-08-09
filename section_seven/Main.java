public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 6000, 2021, "yellow", new String[] {"tires", "filter"})
        };

        Person[] people = new Person[] { 
            new Person("Cleopatra", "Egypt", "69 BC", 1),
            new Person("Alexander the Great", "Macedon", "356 BC", 2),
            new Person("Julius Caesar", "Rome", "100 BC", 3),
            new Person("Hannibal", "Carthage", "247 BC", 4),
            new Person("Confucius", "China", "551 BC", 5),
            new Person("Pericles", "Greece", "429 BC", 6),
            new Person("Spartacus", "Thrace", "111 BC", 7),
            new Person("Marcus Aurelius", "Rome", "121 AD", 8),
            new Person("Leonidas", "Greece", "540 BC", 9),
            new Person("Sun Tzu", "China", "544 BC", 10),
            new Person("Hammurabi", "Babylon", "1750 BC", 11)
        };
    
        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            airline.setPerson(people[i]);
        }

        for (int i = 0; i < people.length; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(airline.getPerson(i));
            }
        }

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