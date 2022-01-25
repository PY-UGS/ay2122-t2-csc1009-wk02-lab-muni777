
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNum= input.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNum= input.nextDouble();
        System.out.println("Enter the third number: ");
        double thirdNum= input.nextDouble();
        double averageResult= (firstNum+secondNum+thirdNum) / 3 ;
        System.out.println("The average of the three number are : "+ averageResult);

    }
;}
