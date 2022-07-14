public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(10.1, 0.7, "area");
        double measure2 = measureRectangle(2.26, 89.21, "perimeter");
        stringPrinter(measure1);
        stringPrinter(measure2);
    }

    public static double measureRectangle(double length, double width, String option) {
        switch (option) {
            case "area": return length * width;
            case "perimeter": return 2 * (length + width);
            default: return 404;
        }
    }

    public static void stringPrinter(double area) {
        System.out.println("The area of the rectangle is " + area);
    }
}