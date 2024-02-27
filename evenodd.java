// HOW TO CHECK A NUMBER IS EVEN OR ODD

import java.util.Scanner;

public class Evenodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int number = sc.nextInt();
        if(number==0){
            System.out.println("LOL ITS ZERO");
        }
        else if(number%2==0){
            System.out.println("ITS EVEN");
        }
        else{
            System.out.println("ITS ODD");
    }
    }
}