// HOW TO FIND Txx in java

import java.util.Scanner;
public class Tax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float salary,tax;
        float rate = (15.0f/100);

        System.out.print("Enter Your Salary : ");
        salary = sc.nextFloat();

        tax = salary*rate;
        System.out.println("Your Income Tax is rs  "+tax);





    }
}