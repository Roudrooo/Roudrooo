import java.util.Scanner;
public class test1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String st="Done";
        int max=0;
        while(true){
            int n=input.nextInt(),count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count>max){
                max=n;
            }
            if(st.equals(input.nextLine())){
                break;
            }
        }
        System.out.println(max);
        input.close();
    }
}