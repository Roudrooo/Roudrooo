package LabAssignment3;

import java.util.Scanner;

public class HW_I4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your BRACU student ID: ");
        int std_id = input.nextInt();
        int session = (std_id/100000)%10;
        int year = std_id/1000000;
        if(session==1){
            System.out.println("Student Joined BRAC in Spring "+year);
        } else if(session==2){
            System.out.println("Student Joined BRAC in Fall "+year);
        } else if(session==3){
            System.out.println("Student Joined BRAC in Summer "+year);
        }
        input.close();
    }
}
