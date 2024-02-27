// HOW TO MULTIPLY 2 NUMBERS IN JAVA

import java.util.Scanner;

public class Mul2nums{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int first,second,result;

        System.out.print("Enter 1st Number : ");
        first = sc.nextInt();

        System.out.print("Enter 2nd Numvber : ");
        second = sc.nextInt();

        result=first*second;
        System.out.println("Thhe Muntiplaaction is: "+result);




    }
}