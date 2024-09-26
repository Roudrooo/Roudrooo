package LabAssignment6;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the width of the pattern: ");
        int width=input.nextInt();
        System.out.print("Enter the length of the pattern: ");
        int length=input.nextInt();
        for(int r=1;r<=length;r++){
            for(int c=1;c<=width;c++){
                if(r==1||r==length||c==1||c==width){
                    System.out.print(c);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}