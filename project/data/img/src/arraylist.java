 
import java.io.*;
import java.util.ArrayList*;
 
class ArrayListExample {
    public static void main(String[] args)
    {
        // Size of the
        // ArrayList
        int n = 5;

        ArrayList<Integer> arrli
            = new ArrayList<Integer>(n);
 
        
        for (int i = 1; i <= n; i++)
            arrli.add(i);
 
        // Printing elements
        System.out.println(arrli);
 
        // Remove element at index 3
        arrli.remove(3);
 
        System.out.println(arrli);
 
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");
    }
}
