package LabAssignment6;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the width of the pattern: ");
        int width=input.nextInt();
        System.out.print("Enter the length of the pattern: ");
        int length=input.nextInt();
        for(int r=1;r<=length;r++){
            for(int c=width;c>=1;c--){
                System.out.print(c);
            }
            System.out.println();
        }
        input.close();
    }
}