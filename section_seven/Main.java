import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] parts = {"tires", "keys"};
        Car nissan = new Car("Nissan", 2000, 2020, "Blue", parts);

        Person uche = new Person("Uchechukwu Ariolu", "Nigerian", "06/11/1005", 11);
        //uche.passport = new String[]{uche.name, uche.nationality, uche.dateOfBirth};

        nissan.setColor("Jet Black");
        double newPrice = nissan.getPrice() / 2;
        nissan.setPrice(newPrice);
        Car nissan2 = new Car(nissan);
        nissan2.setParts(new String[] {"tires", "filter"});

        System.out.println(Arrays.toString(nissan2.getParts()));

        
        uche.chooseSeat(); 

        if (uche.applyPassport()) {
            System.out.println("Congratulations " + uche.getName() + " Your passport was approved!");
        } else {
            System.out.println("We're sorry " + uche.getName() + " We cannot process your application");
        }
    }
}