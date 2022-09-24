public class Main {
  
    public static void main(String[] args) {
        Employee jack = new Employee("Jack", "Programmer");
        Employee gio = new Employee("Gio", "Analyst");
        Employee thomas = new Employee("Thomas", "Specialist");
        System.out.println(Employee.getHiredCount());
    }
  
}
