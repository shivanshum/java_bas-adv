import java.util.Scanner;

public class dv {
    public static void main(String[] args) {
        int studentage =15;
        double studentgpa= 3.45;
        Scanner input =new Scanner(System.in);
        studentgpa =input.nextDouble();
        //char studentfirstinitial = 's';
        //char studentlastinitial ='u';
        boolean attendance = true;
        String studname ="shiva";
        char studfirstinitial = studname.charAt(0);
        char studlastinitial = studname.charAt(4);
        System.out.println(studentage);
        System.out.println(studentgpa);
        System.out.println(studfirstinitial);
        System.out.println(studlastinitial);
        System.out.println(attendance);
        System.out.println(studname);
        System.out.println(studname+studentgpa);
    }
}
