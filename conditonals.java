public class conditonals {
    public static void main(String[] args) {
        int age=26;
        if(age>18){
            System.out.println("yes you can drive");
        }
        else{
            System.out.println("you cant drive");
        }
        boolean a=true;
        boolean b=false;
        if (a && b){
            System.out.println("y");
        }
        else{
            System.out.println("N");
        }
        //
        boolean d=true;
        boolean e=false;
        if (d || e){
            System.out.println("y");
        }
        else{
            System.out.println("N");
        }
        //
        System.out.println("NOT(A) is ");
        System.out.println(!a);
        System.out.println("NOT(B) is ");
        System.out.println(!b);
    }
}
