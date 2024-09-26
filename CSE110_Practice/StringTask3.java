package CSE110_Practice;

import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int checker=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'||str.charAt(i)=='1'){
                checker++;
            }
        }
        if(checker==str.length()){
            System.out.println("Binary Number");
        } else{
            System.out.println("Not a Binary Number");
        }
        input.close();
    }
}
