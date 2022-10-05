
import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int B=sc.nextInt();
        int H=sc.nextInt();
        if(B>=0 && B<=100 && H>=0 && H<=100){
            int area = B*H;
            System.out.println(area);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}