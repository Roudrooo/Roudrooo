package LabAssignment3;

import java.util.Scanner;

public class HW_B2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int a = input.nextInt();
        if(a%5==0 && a%7==0){
            System.out.println("Divisible by Both.");
        } else if(a%5==0 && a%7!=0){
            System.out.println("Invalid: Divisible by 5 Only.");
        } else if(a%5!=0 && a%7==0){
            System.out.println("Invalid: Divisible by 7 Only.");
        } else{
            System.out.println("No.");
        }
        input.close();
    }
}
