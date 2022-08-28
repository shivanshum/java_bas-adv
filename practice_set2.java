public class practice_set2 {
    public static void main(String[] args) {
        String name = "SHIVA on the loose";
        name = name.toLowerCase();
        System.out.println(name);
        //
        String texxt = "TO LOWER CASE";
        texxt = texxt.replace(" ","_");
        System.out.println(texxt) ;
        //
        String lettter = "dear <|name|>, thanks a lot!";
        lettter = lettter.replace("<|name|>","harry");
        System.out.println(lettter);
        //
        String mystring = " this string coantains      doubkr and triple  spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
        //
        String letter2 = "dear shiva,\n\t hold my\n\t beer!";
        System.out.println(letter2);
    }
}
