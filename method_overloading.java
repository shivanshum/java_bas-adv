public class method_overloading {
//    static void change(int a){
//        a =98;
//    }

    public static void main(String[] args) {
//        int [] marks = {12,45,11,54,24,12,10};
//        int x = 45;
//        change(x);
//        System.out.println("X after running change is " + x);
        String name = new String(" LAPOHB TIV");
        String nxt="";
        int i=0;
        char a;
        for (i=0;i<name.length();i++){
             a=name.charAt(i);
            nxt = a+nxt;

        }
        System.out.println(nxt);

    }
}
