package LabAssignment10;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int N=input.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=input.nextInt();
        }
        input.close();
    }
}
