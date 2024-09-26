package LabAssignment4;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = input.nextInt();
        input.close();
        if(n>0){
            for(int i = 0;i<=n;i++){
                if(i%5==0 && i%3!=0){
                    System.out.println(i);
                }
            }
        } else{
            System.out.println("Invalid input!!!");
        }
    }    
}

