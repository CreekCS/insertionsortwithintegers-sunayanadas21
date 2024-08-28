import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class InsSortInt {
    public static void main (String []args) throws FileNotFoundException{
        String fileName= "randInts.txt";
        File file= new File(fileName);
        Scanner scan = new Scanner (file);
        int []arr= new int [1000];
        for (int i=0; i<arr.length; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println(arr[0]+ " "+ arr[999]);
        scan.close();
    }


    
}
