package LabAssignment3;

import java.util.Scanner;

public class HW_I5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = input.nextInt();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.close();
        if(age>=18){
            if(income<10000){
                System.out.println("Your tax amount is 0 Tk.");
            } else if(10000<=income && income<=20000){
                System.out.println("Your tax amount is "+(income*(5.0/100))+" Tk.");
            } else if(20000<income){
                System.out.println("Your tax amount is "+(income*(10.0/100))+" Tk.");
            }
        } else{
            System.out.println("Your tax amount is 0 Tk.");
        }
    }
}
