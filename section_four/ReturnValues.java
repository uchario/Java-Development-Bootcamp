public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(-10.1, 0.7, "area");
        double measure2 = measureRectangle(2.26, 89.21, "perimeter");
        stringPrinter(measure1, "area");
        stringPrinter(measure2, "perimeter");
    }

    public static double measureRectangle(double length, double width, String option) {
        if (length < 0 || width < 0) {
            System.out.println("Length or width cannot be negative.");
            System.exit(0);
        }

        switch (option) {
            case "area": return length * width;
            case "perimeter": return 2 * (length + width);
            default: return 404;
        }
    }

    public static void stringPrinter(double area, String option) {
        System.out.println("The " + option + " of the rectangle is " + area);
    }
}