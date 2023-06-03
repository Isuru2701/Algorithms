public class bubblesort {
    
    public static void main(String[] args) {
        
        int[] arr = {10, 5, 4, 3, 1, 60, 40, 0, 10, 20,40,90};
        int n = arr.length - 1, temp;

        for(int i = 0; i < n; ++i) {
            
            System.out.println("---Iteration " + i + "---");

            for(int j = 0; j < n - i; ++j) {
                
                
                if(arr[j] > arr[j + 1]) {

                    System.out.println("i: " + i + " j: " + j);
                    System.out.println("Swapping " + arr[j] + " with " + arr[j+1]);
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        //print em
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]  + " ");
        }
    }
}
