import java.util.Scanner;
public class inputstat {
    public static void main(String[] args) {
        System.out.println("it works");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1");
        int a = sc.nextInt();
        System.out.println("enter no2");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("sum of two numbers: "+ sum);
    }
}
