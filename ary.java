public class ary {
    public static void main(String[] args) {
//        int [] marks = new int[5];
        int [] marks ={10,20,30,40,50};
        for(int i=4;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("revrse");
        int [] mark ={10,20,30,40,50};
        for(int j=0;j<5;j++) {
            System.out.println(mark[j]);
        }
        int [] a ={1,2,3,4,5};
        int [] b = new int [5];
        for (int m=0,n=4;m<=4;m++,n--){
             b[m] = a[n];
            //System.out.println(a);
            System.out.println(b[m]);
        }
        System.out.println("adding array");
        //
        int [] ary1={1,2,3,4,5};
        int [] ary2={2,3,4,5,6};
        int [] sum = new int [5];
        for (int l=0;l<=4;l++){
            sum[l]= ary1[l] + ary2[l];
            System.out.println(sum[l]);
        }
        //
        
    }
}
