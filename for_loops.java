import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) {
        int i =0;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        while (true){
            System.out.println("i am groot");
            break;
        }
        int a=10;
        do {
            System.out.println(a);
            a++;
        }while (a<5);
        int b =1;
        while (b<=45){
            System.out.println(b);
            b++;
        }
        //
        for (int e=0;e<=10;e++){
            System.out.println(e);
        }
        //
        System.out.println("enter value of n");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int o=0;o<n;o++){
            System.out.println(2*o+1);
        }
        //
        for (int d=10;d>0;d--) {
            System.out.println(d);
        }
        //
        int nn=10;
        for (int no=10;no>=1;no--)
            System.out.println("n natural nos:no"+no);
        //break and continue
        for (int k=0;k<5;k++){
            System.out.println(k);
            System.out.println("java is OMG");
            if (k==2){
                System.out.println("ENDING THE LOOP");
                break;
            }
        }
        int w=0;
        while (w<5){
            System.out.println(w);
            System.out.println("shiva");
            if (w==2){
                System.out.println("ending the loop");
                break;
            }
            w++;
        }
        System.out.println("loop ends here");
    }
}
