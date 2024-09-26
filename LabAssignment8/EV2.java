package LabAssignment8;

import java.util.Scanner;

public class EV2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N = ");
        int N=input.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a number: ");
            arr[i]=input.nextInt();
        }
        int x=input.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println(x+" is at index "+index);
        }
        input.close();
    }
}
