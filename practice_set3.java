import java.util.Scanner;
public class practice_set3 {
    public static void main(String[] args) {
        //
        /*int a=10;
        if (a==11){
            System.out.println("11");
        }
        else
            System.out.println(10);
        //
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in maths");
        m1 = sc.nextByte();

        System.out.println("enter marks in physics");
        m2 = sc.nextByte();

        System.out.println("enter marks in chemistry");
        m3 = sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("you have been promoted");
        }
        else{
            System.out.println(" you have not been promoted");
        }
        */
        //
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter your incime in lakh per annum");
        float tax= 0;
        float income = sc.nextFloat();
        if (income<=2.5){
            tax = tax + 0;
        }
        else if (income>2.5f && tax<5f){
            tax = tax + 0.05f * (income-2.5f);
        } else if (income>5f && income<=10f) {
            tax =tax + 0.05f * (5.0f -2.5f);
            tax =tax + 0.05f * (income-10.0f);
        } else if (income>10.0f) {
            tax =tax + 0.05f * (5.0f -2.5f);
            tax = tax + 0.05f * (10.0f - 5f);
            tax =tax + 0.05f * (income-10.0f);
        }
        System.out.println("the total tax paid by employ is "+tax);*/
        //
       /* Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }*/
        //
        /*System.out.println("enter year");
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("leap");
        }
        else{
            System.out.println("not leap");
        }
         */
        //
        System.out.println("enter website");
        Scanner sc =new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("this is an organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("this is an commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("this is an indian website");
        }
    }
}
