package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Contact {
    private int age;
    private String name;
    private String birthDate;
    private String phoneNumber;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException{
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null/blank");
        }

        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be null/blank");
        }

        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Phone number cannot be less than 5 characters");
        }

        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.birthDate = source.birthDate;
        this.phoneNumber = source.phoneNumber;
        this.age = source.age;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null/blank");
        }
        this.name = name;
    }

    public void setBirthDate(String birthDate) throws ParseException{
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be null/blank");
        }

        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Phone number cannot be less than 5 characters");
        }   
        
        this.phoneNumber = phoneNumber;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int toAge( String birthDate) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        Date toDate = formatter.parse(birthDate);
        long toMilli = toDate.getTime();
        long diff = new Date().getTime() - toMilli;
        return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }
    
    public String toString() {
        return "Name: " + this.name + "\n"
                + "Birth Date: " + this.birthDate + "\n"
                + "Phone Number: " + this.phoneNumber + "\n"
                + "Age: " + this.age + "\n";
    }

}
