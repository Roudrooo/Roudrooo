package LabAssignment10;

import java.util.Scanner;

public class Task2 {
    public static void modifyStrings(String s,String s1,String s2){
        String temp="";
        for(int i=0;i<s.length();i+=s1.length()){
            for(int j=0;j<s1.length();j++){
                temp+=s.charAt(j);
            }
            if(temp.equals(s)){
                System.out.println(100);
            }
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine(),s1=input.nextLine(),s2=input.nextLine();
        modifyStrings(s,s1,s2);
        input.close();
    }
}
