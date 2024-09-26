package LabAssignment6;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the height of the pattern: ");
        int height=input.nextInt();
        for(int r=1;r<=height;r++){
            for(int s=1;s<=height-r;s++){
                System.out.print("  ");
            }
            for(int c=1;c<=2*r-1;c++){
                if(c==1||c==2*r-1||r==height){
                    System.out.print(c+" ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}