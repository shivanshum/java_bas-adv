import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc =new Scanner(System.in);
                age= sc.nextInt();
                switch (age){
                    case 18:
                        System.out.println("u r adult now!");
                        break;
                    case 25:
                        System.out.println("u r gonna join a job");
                        break;
                    case 60:
                        System.out.println("u r gonna retired now");
                        break;
                    default:
                        System.out.println("enjoy ur life!");
                }
                /*
        if(age>56){
            System.out.println("you are xeprinced");
        } else if (age>46) {
            System.out.println("u r semi experinced");
        } else if (age>33) {
            System.out.println("u r bit of experienced");
        }
        else{
            System.out.println("u r unexperienced");
        }*/
    }
}
