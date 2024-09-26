package LabAssignment3;

import java.util.Scanner;

public class HW_I3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();
        if(x<0){
            System.out.println("f(x) = "+(2*x));
        } else if(0<=x && x<2){
            System.out.println("f(x) = "+(x+1));
        } else if(2<=x && x<5){
            System.out.println("f(x) = "+(x*x-1));
        } else if(x>=5){
            System.out.println("f(x) = "+(3*x*x+2));
        }
        input.close();
    }
}