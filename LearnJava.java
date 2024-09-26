// import java.util.Scanner;

// public class LearnJava /*5 DemoL7H5*/ {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String st = scanner.nextLine();
//         String st2 = scanner.nextLine();
//         int a = st.length();
//         int b = st2.length();

//         for (int i = 0; i < a; i++) {
//             int c = 0;
//             for (int j = 0; j < b; j++) {
//                 if (st.charAt(i) == st2.charAt(j) || Character.toLowerCase(st.charAt(i)) == st2.charAt(j)) {
//                     c = 1;
//                 }
//             }
//             if (c == 0) {
//                 System.out.print(st.charAt(i));
//             }
//         }

//         scanner.close();
//     }
// }



// import java.util.Scanner;

// public class LearnJava /*2 CharacterCounter*/ {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String st = scanner.nextLine();
//         int[] ar = new int[100];
//         char[] st2 = new char[20];
//         int c = 0, d = 0;
//         int a = st.length();

//         for (int i = 0; i < a; i++) {
//             if (i == 0 || st.charAt(i - 1) != st.charAt(i)) {
//                 st2[c] = st.charAt(i);
//                 c++;
//             }
//             if (i < a - 1 && st.charAt(i) == st.charAt(i + 1))
//                 ar[d]++;
//             if (i < a - 1 && st.charAt(i) != st.charAt(i + 1))
//                 d++;
//         }

//         for (int i = 0; i <= c - 1; i++)
//             System.out.print(st2[i] + "" + (ar[i] + 1));

//         scanner.close();
//     }
// }




// import java.util.Scanner;

// public class LearnJava /*1 ReverseWords*/ {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String st = scanner.nextLine();
//         int a = st.length();

//         for (int i = a - 1; i >= 0; i--) {
//             if (st.charAt(i) == ' ') {
//                 for (int j = i + 1; j < a; j++) {
//                     System.out.print(st.charAt(j));
//                     if (st.charAt(j) == ' ')
//                         break;
//                 }
//                 System.out.print(" ");
//             }
//         }

//         for (int i = 0; i < a; i++) {
//             if (st.charAt(i) == ' ')
//                 break;
//             System.out.print(st.charAt(i));
//         }

//         scanner.close();
//     }
// }




// import java.util.Scanner;

// public class LearnJava /*3 CharacterChecker*/ {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String st = scanner.nextLine();
//         String st2 = scanner.nextLine();
        
//         int sum = 0;
//         int b = st.length();
//         int a = st2.length();

//         for (int i = 0; i < b; i++) {
//             for (int j = 0; j < a; j++) {
//                 if (st.charAt(i) == st2.charAt(j)) {
//                     sum++;
//                 }
//             }
//             char ch = (char) (st.charAt(i) - 32);
//             if (sum == 0) {
//                 System.out.print(ch);
//             }
//             sum = 0;
//         }

//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < b; j++) {
//                 if (st2.charAt(i) == st.charAt(j)) {
//                     sum++;
//                 }
//             }
//             char ch = (char) (st2.charAt(i) - 32);
//             if (sum == 0) {
//                 System.out.print(ch);
//             }
//             sum = 0;
//         }

//         scanner.close();
//     }
// }



// import java.util.Scanner;

// public class LearnJava /*7 OccurrenceCounter*/ {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         String st = scanner.nextLine();
//         String st2 = scanner.nextLine();
        
//         int a = st.length();
//         int b = st2.length();
//         int sum = 0;

//         for (int i = 0; i < a; i++) {
//             int d = 0;
//             int c = 0;
//             for (int j = 0; j < b; j++) {
//                 if (i + d < a && st.charAt(i + d) == st2.charAt(j)) {
//                     c++;
//                 }
//                 d++;
//             }
//             if (c == b) {
//                 sum++;
//             }
//         }
        
//         System.out.println("Occurrence: " + sum + " time");
        
//         scanner.close();
//     }
// }



// import java.util.Scanner;

// public class LearnJava /*6 PasswordValidator */ {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String st = scanner.nextLine();
//         int a = st.length();
//         int b = 0, c = 0, d = 0, e = 0, f = 0;
        
//         for (int i = 0; i < a; i++) {
//             if (st.charAt(i) >= 97 && st.charAt(i) < 122)
//                 b = 1;
//             if (st.charAt(i) >= 65 && st.charAt(i) <= 90)
//                 c = 1;
//             if (a >= 8)
//                 d = 1;
//             if (st.charAt(i) >= 48 && st.charAt(i) <= 57)
//                 e = 1;
//             if ((st.charAt(i) >= 33 && st.charAt(i) <= 47) || (st.charAt(i) >= 58 && st.charAt(i) <= 64) || (st.charAt(i) >= 91 && st.charAt(i) <= 96))
//                 f = 1;
//         }
        
//         if ((b + c + d + e + f) == 5)
//             System.out.println("True");
//         else
//             System.out.println("False");
        
//         scanner.close();
//     }
// }




// import java.util.Scanner;

// import java.util.Scanner;

// public class LearnJava {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String str = input.nextLine();
//         String x = "";
//         int count = 1;
//         char cmp = str.charAt(0);
        
//         for(int i = 1; i < str.length(); i++) {
//             if(cmp == str.charAt(i)) {
//                 count++;
//             } else {
//                 x += cmp + "" + count;
//                 count = 1;
//                 cmp = str.charAt(i);
//             }
//         }
//         x += cmp + "" + count;
//         System.out.println(x);
//         input.close();
//     }
// }


// HW4
// import java.util.Scanner;

// public class HW4 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String str = input.nextLine();
//         String x = "";
//         int cnt = 1;
//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (Character.isLetter(c)) {
//                 if (cnt % 2 != 0) {
//                     if (c >= 'a' && c <= 'z') {
//                         x += c;
//                     } else {
//                         x += (char)(c + 32);
//                     }
//                     cnt++;
//                 } else {
//                     if (c >= 'a' && c <= 'z') {
//                         x += (char)(c - 32);
//                     } else {
//                         x += c;
//                     }
//                     cnt++;
//                 }
//             } else {
//                 x += c;
//             }
//         }
//         System.out.println(x);
//         input.close();
//     }
// }





// import java.util.Scanner;

// public class HW3 {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         String str1=input.nextLine().toLowerCase(),str2=input.nextLine().toLowerCase(),x="";
//         char c1,c2;
//         for(int i=0;i<str1.length();i++){
//             c1=str1.charAt(i);
//             boolean bool=false;
//             for(int j=0;j<str2.length();j++){
//                 c2=str2.charAt(j);
//                 if(c1!=c2){
//                     bool=true;
//                     break;
//                 }
//             }
//             if(bool){
//                 x+=c1;
//             }
//         }
//         for(int i=0;i<str2.length();i++){
//             c2=str2.charAt(i);
//             boolean bool=false;
//             for(int j=0;j<str1.length();j++){
//                 c1=str1.charAt(j);
//                 if(c2!=c1){
//                     bool=true;
//                     break;
//                 }
//             }
//             if(bool){
//                 x+=c2;
//             }
//         }
//         x=x.toUpperCase();
//         System.out.println(x);
//         input.close();
//     }
// }


// import java.util.Scanner;

// public class LearnJava{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         System.out.println(sum(n));
//         input.close();
//     }
//     public static int sum(int n){
//         int temp=n;
//         if(temp==0){
//             return 0;
//         } else{
//             return temp+sum(--temp);
//         }
//     }
// }
import java.util.Scanner;

public class LearnJava{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(factorial(n));
        input.close();
    }
    public static int factorial(int n){
        int temp=1,fact=1;
        if(temp==n){
            return temp;
        } else{
            return fact*=factorial(++temp);
        }
    }
}