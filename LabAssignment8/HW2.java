package LabAssignment8;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N=input.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Input array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int count=0;
        for(int i=0;i<arr.length;i++){
            int checker=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    checker=1;
                    break;
                }
            }
            if(checker==0){
                count++;
            }
        }
        int[] arr2=new int[count];
        int index=0;
        for(int i=0;i<arr.length;i++){
            int checker=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    checker=1;
                    break;
                }
            }
            if(checker==0){
                arr2[index++]=arr[i];
            }
        }
        System.out.println("New array:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        input.close();
    }
}