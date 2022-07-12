public class ReturnValues {
    public static void main(String[] args) {
        double measure = measureRectangle(10.1, 0.7);
        stringPrinter(measure);
    }

    public static double measureRectangle(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void stringPrinter(double area) {
        System.out.println("The area of the rectangle is " + area);
    }
}