package LabAssignment7;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        int x;
        for(int i=0;i<str1.length();i++){
            x=0;
            char c1=str1.charAt(i);
            for(int j=0;j<str2.length();j++){
                char c2=str2.charAt(j);
                if(c1==c2 || (c1+32)==c2 || c1==(c2+32)){
                    x=1;
                }
            }
            if(x==0){
                System.out.print(c1);
            }
        }
        System.out.println();
        input.close();
    }
}