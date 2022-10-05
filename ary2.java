public class ary2 {
    public static void main(String[] args) {
        // int [] marks;  declarartion
        // marks = new int [5]; memory allocation
        //int [] marks = new int [5]; declaration + memory allocation
        // int [] marks = {10,20,30,40,50} declare + intialize
        int [] marks={10,20,30,40,50};
        float [] result={90,50,30,50,55};
        String [] name= {"shiv", "shiva", "shivansh", "shivanshu"};
        System.out.println(marks[1]);
        System.out.println("lenth ="+ marks.length);
        System.out.println(result[2]);
        System.out.println(name[1] + " length ="+ name.length);
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        //reverse order
        for (int j=marks.length-1;j>=0;j--){
            System.out.println("reverse order "+ marks[j]);
        }
        //for each
        for (int element: marks){
            System.out.println(element);
        }

    }
}
