import java.util.Scanner;
public class practice_set {
    public static void main(String[] args) {
          float m= 7/4f*9/2f;
        System.out.println(m);
        //
        char grade = 'B';
        grade=(char)(grade+8);
        System.out.println(grade);
        //decrypt
        grade=(char) (grade-8);
        System.out.println(grade);
        //
        Scanner sc= new Scanner(System.in);
        int b= sc.nextInt();
        System.out.println(b>8);
        //
        int v=2,u=8,s=4,a=2;
        float so = (v*v-u*u)/(2*a*s);
        System.out.println(so);
        //

    }
}
