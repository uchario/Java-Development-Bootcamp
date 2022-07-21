import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String [] menu = {"Espresso", "Iced Coffee", "Machiatos"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String [] newMenu = new String [5];
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
            System.out.println(i + ". " + newMenu[i]);
        }
        int [] numbers = new int[5];
        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers));
    }
}