package CSE110_Practice;

import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" : "+str.codePointAt(i));
        }
        input.close();
    }
}
