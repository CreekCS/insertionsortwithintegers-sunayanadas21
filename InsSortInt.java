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
        insSort(arr);
        System.out.println("Smallest Int: "+ arr[0]+ " Largest Int: "+ arr[999]);
        scan.close();
        
    }
    public static void insSort(int []ar){
       
        for (int i=0; i<ar.length; i++){
            int key=ar[i];
            int j=0;
            key= ar[i];
            j=i-1;
            while (j>=0 && ar[j]>key){
                ar[j+1]= ar[j];
                j=j-1;
                ar[j+1]=key;
            }
        }

    }


    
}
