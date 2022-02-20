import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner nBox = new Scanner(System.in);
        
        // reading the size of the array 
        int size = nBox.nextInt();
        
        // creating an array with the specified size 
        int[] arr = new int[size];
        
        // read the next number into the array as we transverse  with the for loop
        for (int i = 0; i < size; i++) {
            arr[i] = nBox.nextInt();
        }
        // reading the n
        int n = nBox.nextInt();
        
        int counter = 0;               // declaration of the counter 
        int i = 0;                     // declaration of the int i 
        // iterate for each variable in the array  
        while (i < size) { //if  i is less thaa the assigned size
            // count the variable that was declared as n, 
            //for every element of n in the array
            if (n == arr[i]) {
                counter++;
            }
            i++;
        }
        
        //or a foreach array iteration for the for loop above
        /*
        for (i : arr) {                // iterate for each element in the array 
            if (n == arr[i]) {
                counter++;             // count the elements of n that was declared in the array
            }
        }
        */
        
        System.out.println(counter);   // printing the results of the counter
         
    }
}
