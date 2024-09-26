package LabAssignment7;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String x="";
        int count=1;
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(('a'<=c && c<='z') || ('A'<=c && c<='Z')){
                if(count%2!=0){
                    if('A'<=c && c<='Z'){
                        c=(char)(c+32);
                    }
                } else{
                    if('a'<=c && c<='z'){ 
                        c=(char)(c-32);
                    }
                }
                count++;
            }
            x+=c;
        }
        System.out.println(x);
        input.close();
    }
}