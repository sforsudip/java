//HOW TO CHECK VOTER ELIGIBILITY IN JAVA

import java.util.Scanner;

public class Votercheck{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int age;

    System.out.print("Enter your age: ");
    age = sc.nextInt();
    if(age>=18){
        System.out.println("You are eligible for voting");
    }
    else{
        System.out.println("Your are not eligible for voting");
    }

    }
}