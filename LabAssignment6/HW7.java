package LabAssignment6;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of the pattern: ");
        int length=input.nextInt();
        for(int r=1;r<=length;r++){
            for(int s=1;s<=length-r;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*r-1;c++){
                if(c==1||c==2*r-1){
                    System.out.print(c);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int r=length;r>1;r--){
            for(int s=0;s<=length-r;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*r-3;c++){
                if(c==1||c==2*r-3){
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