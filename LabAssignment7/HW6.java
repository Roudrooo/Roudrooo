package LabAssignment7;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int a=0,b=0,c=0,d=0,e=0;
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x>=8){
                a=1;
            }
            if('A'<=x && x<='Z'){
                b=1;
            }else if('a'<=x && x<='z'){
                c=1;
            }else if('0'<=x && x<='9'){
                d=1;
            }else{
                if(x!=' '){
                    e=1;
                }
            }
        }
        if((a+b+c+d+e)==5){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        input.close();
    }
}