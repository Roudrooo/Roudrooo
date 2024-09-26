package LabAssignment2;

public class TaskE7 {
    public static void main(String[] args){
        float t = 5f+(56f/60f)+(23f/(60f*60f));
        int my_std_id = 24101226;
        int last_4_digits = my_std_id%10000;
        float d = last_4_digits/1000f;
        float vel_KMperHour = d/t;
        float vel_MILESperHour = vel_KMperHour/1.609f;
        System.out.println("Your velocity in km/h is: "+vel_KMperHour);
        System.out.println("Your velocity in miles/h is: "+vel_MILESperHour);
    }
}
