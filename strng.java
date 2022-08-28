public class strng {
    public static void main(String[] args) {
        String  name = new String("shiVa");
        //String work= "developer";
        //System.out.print(name + work);
        //int a= 6;
        //float b= 5.456f;
        //System.out.printf("the value of a is %d and value of b is %f", a, b);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ulstring = name.toUpperCase();
        System.out.println(ulstring);

        String nontrimmedString = "    shivanshu   ";
        System.out.println(nontrimmedString.trim());
        System.out.println(name.substring(1,4));
    }
}
