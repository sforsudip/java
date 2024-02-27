//SUM OF N NATURAL NUMBERS

import java.util.Scanner;
public class SumOfN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number,sum=0;
        System.out.print("Enter Number of Terms : ");
        number = sc.nextInt();

        for(int i=0; i<=number; i++){
            sum=sum+i;
        }
        System.out.println("The Sum of 1st " +number+ " natutral numbers is "+sum);





    }

}