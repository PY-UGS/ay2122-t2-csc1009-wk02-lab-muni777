import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        String[] zodiacSigns = {"monkey,", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        int zodiacYear = year % 12;


        System.out.println(zodiacSigns[zodiacYear]);
        input.close();
        //System.out.println("Test");

    }
}
