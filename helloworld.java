public class helloworld {
    public static void main(String[] args) {
        int i,count=0;
                for(i=0;i<=100;i++)
                {
                    if(i%5==0 || i%7==0) {
                        System.out.println("hello world number is divisible by 5 or 7:" + i);
                        count++;
                    }
                }
                System.out.println("total number of count:" + count);
    }
}
