package LabAssignment7;


import java.util.Scanner;

public class HW7{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("str1 = ");
        String str1=input.nextLine();
        System.out.print("str2 = ");
        String str2=input.nextLine();
        int sum=0;
        for (int i=0;i<(str1.length()-str2.length());i++) {
            int cmp=0;
            for (int j=0;j<str2.length();j++){
                if(str1.charAt(i+j)==str2.charAt(j)){
                    cmp++;
                }
            }
            if(cmp==str2.length()){
                sum++;
            }
        }
        System.out.println("Occurrence: "+sum+" time");
        input.close();
    }
}