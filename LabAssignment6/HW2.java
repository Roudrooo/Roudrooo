package LabAssignment6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the height of the pattern: ");
        int height=input.nextInt();
        for(int r=1;r<=height;r++){
            for(int s=1;s<=height-r;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print(c);
            }
            for(int c=r-1;c>=1;c--){
                System.out.print(c);
            }
            System.out.println();
        }
        input.close();
    }
}