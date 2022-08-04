import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissag", 5000, 2020, "Blue");

        Car dodge = new Car("Dodge", 10000, 2019, "Red");

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