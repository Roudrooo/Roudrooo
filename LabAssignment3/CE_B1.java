package LabAssignment3;

import java.util.Scanner;

public class CE_B1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        if(a<b&&a<c){
            System.out.println("Smallest number: "+a);
        } else if(b<a&&b<c){
            System.out.println("Smallest number: "+b);
        } else if(c<a&&c<b){
            System.out.println("Smallest number: "+c);
        }
        input.close();
    }
}
