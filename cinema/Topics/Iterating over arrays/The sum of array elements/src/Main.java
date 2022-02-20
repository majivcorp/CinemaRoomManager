import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner mBox = new Scanner(System.in);
        int size = mBox.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        
        
        while (mBox.hasNextInt()) {
            for (int i = 0; i < size; i++) {
                arr[i] = mBox.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
