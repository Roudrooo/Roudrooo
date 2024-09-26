package LabAssignment7;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine(),str1="",str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                str1+=str.charAt(i);
            } else{
                str2=str1+" "+str2;
                str1="";
            }
        }
        str2=str1+" "+str2;
        str1="";
        for(int i=0;i<str2.length()-1;i++){       //To eliminate the extra space at the last of the string
            str1+=str2.charAt(i);
        }
        System.out.println(str1);
        input.close();
    }
}