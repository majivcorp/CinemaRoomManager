import java.util.*;


public class Main {
    public static void main(String[] args) {
        // To get the instance of Java Scanner which reads input from the user, 
        //we need to pass the input stream (System.in) 
        //in the constructor of Scanner class.
        Scanner mBox = new Scanner(System.in);
        
        
        
        int[] boxArr1 = new int[3];
        int[] boxArr2 = new int[3];
        
        
        int c = 3;
        
        for (int i = 0; i < c; i++) {
            if (i < 3) {
                boxArr1[i] = mBox.nextInt();
            } 
        }
        
        for (int j = 0; j < c; j++) {
            if (j < 3) {
                boxArr2[j] = mBox.nextInt();
            } 
        }
        
    
        /*
        int X1, Y1, Z1;
        int X2, Y2, Z2;
        X1 = boxArr1[0]; Y1 = boxArr1[1]; Z1 = boxArr1[2];
        X2 = boxArr1[0]; Y2 = boxArr1[1]; Z2 = boxArr1[2];
        */
        
        
         
        
        Arrays.sort(boxArr1);
        Arrays.sort(boxArr2);
        
        
        if (boxArr1[0] > boxArr2[0] && boxArr1[1] > boxArr2[1] && boxArr1[2] > boxArr2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (boxArr1[0] < boxArr2[0] && boxArr1[1] < boxArr2[1] && boxArr1[2] < boxArr2[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
            
        /*
        
        int counter = 0;
        int count = 0;
        for (int x = 0; x < boxArr1.length; x++){
            counter = boxArr1[x] < boxArr2[x] ? --counter : ++counter;
            
        }
        */
        /*
        if (counter == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (counter == -3) {
            System.out.println("Box 1 < Box 2");
        } else if (counter != 3 && counter != -3) {
            System.out.println("Incompatible");
        } */
        /*
        switch (counter) {
            case 3:
                System.out.println("box1 > box2");
            case -3:
                System.out.println("box1 < box2");
            case ! 3 && counter != -3:
                System.out.println("incompatible");
            default:
                System.out.println("incompatible");
        }
        */
               
        
        
        
    }
}
