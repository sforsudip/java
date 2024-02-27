// HOW TO TAKE INPUT IN JAVA

import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        System.out.print("Enter your Number : ");
        Scanner s = new Scanner(System.in);
        float num = s.nextFloat();
        System.out.println("Your Number is "+ num);
    }
}