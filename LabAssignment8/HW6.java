package LabAssignment8;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.print("Please enter the length of the arrays: ");
        int N=input.nextInt();
        int[] marks=new int[N];
        String[] names=new String[N];
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter student's mark: ");
            marks[i]=input.nextInt();
        }
        for(int i=0;i<names.length;i++){
            System.out.print("Enter student's name: ");
            names[i]=input1.nextLine();
        }
        for(int i=0;i<marks.length-1;i++){
            for(int j=0;j<marks.length-i-1;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    String s_temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=s_temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
        input.close();
        input1.close();
    }
}
