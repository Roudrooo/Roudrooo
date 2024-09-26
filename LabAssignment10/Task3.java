package LabAssignment10;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.print("Length of the array: ");
        int N=input.nextInt();
        String[] email_list=new String[N];
        for(int i=0;i<N;i++){
            email_list[i]=input1.nextLine();
        }
        int validEmail=0;
        for(int i=0;i<N;i++){
            int atcount=0,charBefAt=0,dotcount=0;
            for(int j=0;j<email_list[i].length();j++){
                if(email_list[i].charAt(j)=='@'){
                    atcount++;
                }
                if(j<email_list[i].indexOf('@')&&((email_list[i].charAt(j)>='A'&&email_list[i].charAt(j)<='Z')||(email_list[i].charAt(j)>='a'&&email_list[i].charAt(j)<='z'))){
                    charBefAt++;
                }
                if((j>email_list[i].indexOf('@')&&j<email_list[i].length()-1)&&email_list[i].charAt(j)=='.'){
                    dotcount++;
                }
            }
            if(atcount==1&&charBefAt>0&&dotcount>0){
                validEmail++;
            }
        }
        System.out.println("Your array is = "+Arrays.toString(email_list));
        System.out.printf("Valid email count is = %d\n",validEmail);
        input.close();
        input1.close();
    }
}