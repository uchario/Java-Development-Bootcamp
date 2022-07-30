import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();

        nissan.make = "Nissan";
        nissan.price = 5000;
        nissan.year = 2020;
        nissan.color = "Blue";

        Car dodge = new Car();
        dodge.make = "Dodge";
        dodge.price = 10000;
        dodge.year = 2019;
        dodge.color = "Red";

        Person uche = new Person();
        uche.name = "Uchechukwu Ariolu";
        uche.nationality = "Nigerian";
        uche.dateOfBirth = "06/11/1005";
        uche.passport = new String[]{uche.name, uche.nationality, uche.dateOfBirth};
        uche.seatNumber = 11;

        System.out.println(nissan.make);
        System.out.println(nissan.price);
        System.out.println(nissan.year);    
        System.out.println(nissan.color);

        System.out.println("\n" + uche.name);
        System.out.println(uche.nationality);
        System.out.println(uche.dateOfBirth);  
        System.out.println(Arrays.toString(uche.passport));  
        System.out.println(uche.seatNumber);
    }
}