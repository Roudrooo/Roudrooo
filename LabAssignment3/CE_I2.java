package LabAssignment3;

import java.util.Scanner;

public class CE_I2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        input.close();
        if(n<0){
            System.out.println("Number is negative");
        } else if(n==0){
            System.out.println("Number is zero");
        } else if (n>0){
            if(n%2==0){
                System.out.println("Number is positive and even");
            } else{
                System.out.println("Number is positive and odd");
            }
        }
    }
}
