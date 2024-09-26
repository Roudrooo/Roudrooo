package LabAssignment8;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the length of array: ");
        int N=input.nextInt();
        int[] arr=new int[N];
        System.out.println("Please enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Please enter the target value:");
        int x=input.nextInt();
        int count=0,I=-1,J=-1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(x==(arr[i]+arr[j])){
                    I=i;
                    J=j;
                    count=1;
                    break;
                }
            }
            if(count==1){
                break;
            }
        }
        if(count==1){
            System.out.println("Elements need to be added: "+arr[I]+" "+arr[J]);
            System.out.printf("Index of the elements: %d and %d\n",I,J);
        }
        input.close();
    }
}