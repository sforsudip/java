//HOW TO TAKE STRING INPUT IN JAVA

import java.util.Scanner;
public class StringInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Message : ");
        String message = sc.nextLine();

        System.out.println(message);

    }
}