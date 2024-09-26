package LabAssignment8;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N = ");
        int N=input.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a number: ");
            arr[i]=input.nextInt();
        }
        System.out.println("Original Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            int max_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[max_idx]){
                    max_idx=j;
                }
            }
            int temp=arr[max_idx];
            arr[max_idx]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        input.close();
    }
}
