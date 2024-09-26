package LabAssignment3;

import java.util.Scanner;

public class HW_E8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int a = input.nextInt();
        System.out.print("Input the 2nd number: ");
        int b = input.nextInt();
        System.out.print("Input the 3rd number: ");
        int c = input.nextInt();
        input.close();
        if(a==b && b==c){
            System.out.println("All numbers are equal.");
        } else if(a!=b && b!=c && c!=a){
            System.out.println("All numbers are different.");
        } else{
            System.out.println("Neither all are equal or different.");
        }
    }
}
