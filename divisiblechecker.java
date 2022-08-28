import java.util.Scanner;
public class divisiblechecker {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        num=sc.nextInt();
        if(num%5==0)
            System.out.println("The Number Is Divisible By 5.");

        else
        {
            System.out.println("The Number Is Not Divisible By 5.");
        }
    }
}
