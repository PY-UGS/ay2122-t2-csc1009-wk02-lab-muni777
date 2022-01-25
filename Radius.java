import java.util.Scanner;
public class Radius {
    public static void main(String[] args) {
        final float PI = 3.14159F;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number for radius : ");
        float radiusLength= input.nextFloat();
        float circleArea= radiusLength * radiusLength * PI;
        System.out.println("The area for circle of radius " + radiusLength + " is "+ circleArea);
    }
}
