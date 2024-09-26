package LabAssignment5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Start: ");
        int n1 = input.nextInt();
        System.out.print("Stop: ");
        int n2 = input.nextInt();
        for(int i=n1;i<=n2;i++){
            System.out.printf("Times Table of %d:\n",i);
            for(int j=1;j<=10;j++){
                System.out.printf("%d x %d = %d\n",i,j,(i*j));
            }
        }
        input.close();
    }
}
