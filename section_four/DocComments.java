public class DocComments {
    public static void main(String[] args) {

    }

    /**
     * Function name: greet
     * 
     * Inside the function:
     *   1. print: 'Hi';
     */
    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function name: printText
     * @param name (String)
     * @param age (String)
     * 
     * Inside the function:
     * 1. print: name and age as part of a text
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * Function name: calculateArea
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     *   1. Calculates the area and returns it
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
