import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2000, 2020, "Blue");

        Person uche = new Person("Uchechukwu Ariolu", "Nigerian", "06/11/1005", 11);
        //uche.passport = new String[]{uche.name, uche.nationality, uche.dateOfBirth};

        nissan.setColor("Jet Black");
        double newPrice = nissan.getPrice() / 2;
        nissan.setPrice(newPrice);

        nissan.drive();

        System.out.println(nissan.getPrice());
        System.out.println(nissan.getYear());    
        System.out.println(nissan.getColor());

        uche.chooseSeat();

        System.out.println("\n");
        System.out.println(uche.getName() + "\tSeat No. " + uche.getSeatNumber());
        System.out.println(uche.getNationality());
        System.out.println(uche.getDateOfBirth());  
        System.out.println(Arrays.toString(uche.passport));  

        if (uche.applyPassport()) {
            System.out.println("Congratulations " + uche.getName() + " Your passport was approved!");
        } else {
            System.out.println("We're sorry " + uche.getName() + " We cannot process your application");
        }
    }
}