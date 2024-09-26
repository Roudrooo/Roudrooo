package LabAssignment7;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine(),x="";
        int count=1;    //Already have a character
        char cmp=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(cmp==str.charAt(i)){
                count++;
            } else{
                x+=""+cmp+count;    //Converted to string
                count=1;
                cmp=str.charAt(i);  //Made it able to compare
            }
        }
        x+=""+cmp+count;    //For last
        System.out.println(x);
        input.close();
    }
}
