import java.util.Scanner; // A java.util package. that is used to  read input streams

class Main {
    public static void main(String[] args) {
        // To get the instance of Java Scanner which reads input from the user, 
        //we need to pass the input stream (System.in) 
        //in the constructor of Scanner class.
        Scanner len = new Scanner(System.in);
        
        // reads an integer number n and stores it
        int arrLen = len.nextInt();
        
        // we assign the scanned integer arrLen as the length of the numArr integer array.
        int[] numArr = new int[arrLen];
        // The for loop reads an array of ints and stores it into the numArr integer Array.
        for (int i = 0; i < arrLen; i++) {
            numArr[i] = len.nextInt();
        }
 
        //sum all the array elements greater than n        
        int sum = 0;
        int strikePoint = len.nextInt();
        for (int j : numArr) {
            if (j > strikePoint) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
