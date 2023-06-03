public class selectionsort {
    
    public static void main(String[] args) {

        int[] arr = {50,20, 10,20,40, 30, 3, 10, 60, 20, 1};

        int n = arr.length;
        int temp;

        //Select smallest from the array
        //Shift smallest data into the front
        // Repeat for the rest

        for(int i = 0; i < n; ++i) {
            
            System.out.println("Iteration: " + i);
            int minPointer = i;

            //find min:
            for(int j = i; j < n; ++j) {
                System.out.println(arr[minPointer] +  " < " + arr[j] + " " + (arr[minPointer] < arr[j]));
                if(arr[j] < arr[minPointer]) {
                    
                    minPointer = j;
                }
            }

            System.out.println("lowest: " + arr[minPointer]);

            //shift:
            temp = arr[i];
            arr[i] = arr[minPointer];
            arr[minPointer] = temp;

            

        }



       for(int i = 0; i < n; ++i) {
        System.out.print(arr[i] + " ");
       }

    }
}