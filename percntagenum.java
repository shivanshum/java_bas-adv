import java.util.Scanner;
public class percntagenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks for subject 1: ");
        float a = sc.nextFloat();
        System.out.println("enter marks for subject 2: ");
        float b =sc.nextFloat();
        System.out.println("enter numbers for subject 3: ");
        float c =sc.nextFloat();
        System.out.println("enter numbers for subject 4: ");
        float d =sc.nextFloat();
        System.out.println("enter numbers for subject 5: ");
        float e =sc.nextFloat();
        float total = a+b+c+d+e;
        float per = total*100/500;
        System.out.println("percentage obtained: "+ per);
        // cgpa calculation
        float sub1 = 45;
        float sub2 = 95;
        float sub3 = 48;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);
        // print name with message
        System.out.println("what is your name");
        Scanner sac = new Scanner(System.in);
        String name = sac.next();
        System.out.println("heloo " + name + " have a good day");
        // detect num is integer or not
        System.out.println("enter your number");
        Scanner suc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
