package LearnArray;


public class Array1 {
    public static void main(String[] args){
        int[] arr={40,2,27, -7,14};
        for(int i=0;i<(arr.length-1);i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx=j;
                }    
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
         // implementing Bubble Sort on the created array

        for (int i = 0; i < arr.length-1; i++){
            // comparing between the two adjacent index elements in a loop
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j+1] < arr[j]){
                    // swapping the values 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
 
        // displaying the elements of the sorted array
        for (int idx = 0; idx < arr.length; idx++){
            System.out.println(arr[idx]);
        }

    }
}