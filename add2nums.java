//HOW TO ADD 2 NUMBERS

import java.util.Scanner;

public class Add2nums{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int firstnum,secondnum,result;

        System.out.print("Enter 1st Number : ");
        firstnum = s.nextInt();

        System.out.print("Enter 2nd Number : ");
        secondnum = s.nextInt();

        result = firstnum+secondnum;
        System.out.println("Sum is "+ result);

        






    }
}