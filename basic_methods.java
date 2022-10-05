import java.lang.reflect.Constructor;

public class basic_methods {
    static void telljoke(){
        System.out.println("women HA HA HA HAHA");
    }
    static int logic(int x,int y){
        int r;
        if (x>y){
            r=x+y;
        }
        else {
            r= (x+y)*5;
        }
        return r;
    }
    public static void main(String[] args) {
        int a = 60;
        int b=9;
        int c;
        c = logic(a,b);
        int a1 = 10;
        int b1 = 20;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
        telljoke();
        // don't repeat yourself
    }
}
