// HOW TO PRINT MULTIPLICATION TABLE IN JAVA

import java.util.Scanner;

public class Multable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();


        for(int i=1; i<=10; i++){
            System.out.println(number +"x"+ i+ "="+ number*i);
        }

    }
}