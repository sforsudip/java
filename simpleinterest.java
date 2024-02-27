//HOW TO FIND SIMPLE INTREST IN JAVA

import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float principle,time,rate,si;

        System.out.print("Enter Principle : ");
        principle = sc.nextFloat();

        System.out.print("Enter Time : ");
        time = sc.nextFloat();

        System.out.print("Enter Rate : ");
        rate = sc.nextFloat();

        si = (principle*time*rate)/100;
        System.out.print("Your Simple Interest is : "+si);

        sc.close();

    }
}
