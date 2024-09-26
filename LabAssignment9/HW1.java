package LabAssignment9;

import java.util.Scanner;

public class HW1 {
    public static boolean isPrime(int x){ // A
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        } else{
            return false;
        }
    }
    public static boolean isPerfect(int x){ // B
        int sum=0;
        for(int i=1;i<x;i++){
            if(x%i==0 && x!=2){
                sum+=i;
            }
        }
        if(sum==x){
            return true;
        } else{
            return false;
        }
    }
    public static int special_sum(int o){ // C
        int sum=0;
        for(int i=1;i<=o;i++){
            if(isPrime(i)||isPerfect(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // A:
        System.out.print("A:\nFor Prime: ");
        int m=input.nextInt(); 
        boolean check1=isPrime(m);
        System.out.println("Prime check: "+check1);
        // B:
        System.out.print("B:\nFor Perfect: ");
        int n=input.nextInt();
        boolean check2=isPerfect(n);
        System.out.println("Perfect check: "+check2);
        // C:
        System.out.print("C:\nN: ");
        int o=input.nextInt();
        System.out.println("Special sum: "+special_sum(o));
        input.close();
    }
}
// package LabAssignment9;

// import java.util.Scanner;

// public class HW1 {
//     public static boolean isPrime(int x){ // A
//         int count=0;
//         for(int i=1;i<=x;i++){
//             if(x%i==0){
//                 count++;
//             }
//         }
//         if(count==2){
//             return true;
//         } else{
//             return false;
//         }
//     }
//     public static boolean isPerfect(int x){ // B
//         int sum=0;
//         for(int i=1;i<x;i++){
//             if(x%i==0 && x!=2){
//                 sum+=i;
//             }
//         }
//         if(sum==x){
//             return true;
//         } else{
//             return false;
//         }
//     }
//     public static int special_sum(int i){ // C
//         int sum=0;
//         if(isPrime(i)||isPerfect(i)){
//             sum+=i;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         // A:
//         System.out.print("A:\nFor Prime: ");
//         int m=input.nextInt(); 
//         boolean check1=isPrime(m);
//         System.out.println("Prime check: "+check1);
//         // B;
//         System.out.print("B:\nFor Perfect: ");
//         int n=input.nextInt();
//         boolean check2=isPerfect(n);
//         System.out.println("Perfect check: "+check2);
//         // C
//         System.out.print("C:\nN: ");
//         int o=input.nextInt();
//         int result=0;
//         for(int i=1;i<=o;i++){
//             result+=special_sum(i);
//         }
//         System.out.println("Special sum: "+result);
//         input.close();
//     }
// }