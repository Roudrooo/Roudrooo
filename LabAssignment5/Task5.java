package LabAssignment5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int pft_num=2, count = 1;
        while(count<=N){
            int sum = 0;
            for(int i=1;i<pft_num;i++){
                if(pft_num%i==0){
                    sum+=i;
                }
            }
            if(sum==pft_num){
                System.out.println(pft_num);
                count++;
            }
            pft_num++;
        }
        input.close();
    }
}
