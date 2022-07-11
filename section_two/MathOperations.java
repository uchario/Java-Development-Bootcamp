public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScores = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " bags of sweets.");
        System.out.println("There are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Mlky way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScores + bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled.");

        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweeets than George.");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScores - bonusMarks) + " on his potions test.");

        System.out.println("Fred and George used a special spell to multiply their sweets to " + (bagOfSweets1 * bagOfSweets2));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to " + (testScores * bonusMarks));
        System.out.println(starsInAndromeda * starsInMilkyWay);

        System.out.println("Originally, Fred had " + (bagOfSweets2/bagOfSweets1) + " time more sweets than George.");
        System.out.println("Andromeda has " + (starsInAndromeda/starsInMilkyWay) + " times more stars than the Milky Way.");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScores/bonusMarks));

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (bagOfSweets2%2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (bagOfSweets1%2));

        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("I count: " + counter);

        counter--;
        counter--;
        counter--;
        System.out.println("I count: " + counter);
    }
}
