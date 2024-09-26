package CSE110_Practice;

import java.util.Scanner;

public class StringTask2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int idx=input.nextInt();
        String new_str="";
        for(int i=0,j=idx;i<str.length()||j>=0;i++,j--){
            if(i<=idx){
                new_str+=str.charAt(j);
            }else{
                new_str+=str.charAt(i);
            }
        }
        System.out.println(new_str);
        input.close();
    }
}
