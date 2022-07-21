import java.util.Arrays;

public class ReferenceTrap {
    public static void main (String[] args) {
        String[] staffLastYear = {"Joel", "Sandy", "Mandy"};
        String [] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Arich";

        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));
    }
}