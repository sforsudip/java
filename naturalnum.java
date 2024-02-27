//PRINT N NATURAL NUMBERS

import java.util.Scanner;
public class Nautralnum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number of Terms : ");
        int number = sc.nextInt();

        for(int i=0; i<=number; i++){
            System.out.println(i);
        }      
    }
}