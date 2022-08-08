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

        System.out.println(nissan);
        System.out.println(nissan2);

        if (uche.applyPassport()) {
            uche.setPassport();
        } else {
            System.out.println("\nWe're sorry " + uche.getName() + " We cannot process your application");
        }

        System.out.println("\nName: " + uche.getName() + "\n" + "Nationality: " + uche.getNationality() + "\n" + "Date of birth: " + uche.getDateOfBirth() + "\n" + "Seat Number: " + uche.getSeatNumber() + "\n" + "Passport: " + Arrays.toString(uche.getPassport()));
    }
}