public class Parameters {
    public static void main(String[] args) {
        measureRectangle(2.3, 4.6);
    }

    public static void measureRectangle(double length, double width) {
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area + "\n");
    }
}