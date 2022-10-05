import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int k=1;k<=n;k++){
                int sum=a;
                int z=1;
                for(int j=1;j<=k;j++){
                    sum=sum+(z*b);
                    z=z*2;
                }
                
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        
        in.close();

    }
}
