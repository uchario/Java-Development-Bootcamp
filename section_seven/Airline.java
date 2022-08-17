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

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.seats.length; i++) {
            if (seats[i] != null) {
                temp += seats[i].toString();
                temp += "\n\n";
            } else {
                temp += "Seat" + (i + 1) + " is empty.";
                temp += "\n\n";
            }
        }
        return temp;
    }
}
