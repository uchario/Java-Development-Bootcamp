import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args)  {
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 59},
            {65, 58, 29, 57}
        };
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
        }
        System.out.println(Arrays.toString(grades[1]));
    }
}