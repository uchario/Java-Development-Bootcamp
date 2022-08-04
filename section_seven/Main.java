import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2000, 2020, "Blue");

        Car dodge = new Car("Dodge", 10000, 2019, "Red");

        Person uche = new Person("Uchechukwu Ariolu", "Nigerian", "06/11/1005", 11);
        uche.passport = new String[]{uche.name, uche.nationality, uche.dateOfBirth};

        nissan.setColor("Jet Black");
        double newPrice = nissan.getPrice() / 2;
        nissan.setPrice(newPrice);

        System.out.println(nissan.getMake());
        System.out.println(nissan.getPrice());
        System.out.println(nissan.getYear());    
        System.out.println(nissan.getColor());

        System.out.println("\n" + uche.name);
        System.out.println(uche.nationality);
        System.out.println(uche.dateOfBirth);  
        System.out.println(Arrays.toString(uche.passport));  
        System.out.println(uche.seatNumber);
    }
}