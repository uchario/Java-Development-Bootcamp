public class Airline {
    private Person[] seats;

    public Airline() {
        this.seats = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(this.seats[index]);
    }

    public void setPerson(Person person) {
        this.seats[person.getSeatNumber() - 1] = new Person(person);
    }

    public void createReservation(Person person) {
        while (seats[person.getSeatNumber() - 1] != null) {
            System.out.println("\n" 
                                + person.getName() 
                                + ", seat:" 
                                + person.getSeatNumber()
                                + " seat is already taken. Please choose another one." 
                                + "\n");
            person.chooseSeat();
        }
        
        System.out.println("Thank you "  
                            + person.getName() 
                            + " for flying with java airlines. Your seat number is " 
                            + person.getSeatNumber()
                            + ".\n");
    }
}
