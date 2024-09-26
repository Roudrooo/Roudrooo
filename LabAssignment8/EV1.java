package LabAssignment8;

import java.util.Scanner;

public class EV1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N = ");
        int N=input.nextInt();
        int[] arr1=new int[N];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("Original array:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                arr1[i]=1;
            } else if(arr1[i]<0){
                arr1[i]=0;
            }
        }
        System.out.println("After modifying:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        input.close();
    }
}
