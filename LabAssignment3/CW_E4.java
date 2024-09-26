package LabAssignment3;

import java.util.Scanner;

public class CW_E4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sides of the triangle are:");
        System.out.print("a = ");
        float a = input.nextFloat();
        System.out.print("b = ");
        float b = input.nextFloat();
        System.out.print("c = ");
        float c = input.nextFloat();
        if((a+b)>c&&(b+c)>a&&(c+a)>b){
            if(a==b&&b==c){
                System.out.println("This is a Equilateral triangle.");
            } else if((a==b&&b!=c)||(b==c&&c!=a)||(a==c&&c!=b)){
                System.out.println("This is a Isosceles triangle.");
            } else{
                System.out.println("This is a Scalene triangle.");
            }
        } else{
            System.out.println("Invalid input!!!");
        }
        input.close();
    }
}
