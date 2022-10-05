public class practice_set4 {
    public static void main(String[] args) {
        //
        int n=4;
        for (int i=n;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //
        //
        int sum=0,e=4;
        for(int j = 0; j <e; j++){
         sum = sum + (2* j);
        }
        System.out.print("sum of even number is: ");
        System.out.println(sum);
        //
        //
//        int table=5;
//        for(int t=1;t<=10;t++){
//            System.out.printf("%d  X  %d = %d\n",table,t,table*t);
//        }
        //
        //
        int table=10;
        for(int t=10;t>=1;t--){
            System.out.printf("%d  X  %d = %d\n",table,t,table*t);
        }
        //
        //
        int o=5,f=1,factorial=1;
        while(f<=o){
            factorial *= f;
            f++;
        }
        System.out.println(factorial);
        //
        //
        
    }
}
