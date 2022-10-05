public class practc_set_arry {
    public static void main(String[] args) {
        //sum of float elements
        /*
        float [] marks ={10.0f,12.0f,26.0f,45.0f,20.0f};
        float sum=0;
        for (float element:marks){
            sum = sum+element;
        }
        System.out.println("sum of float elements: " + sum);*/
        //find a number in array
        /*float [] marks ={10.0f,12.0f,26.0f,45.0f,20.0f};
        float num=26.1f;
        boolean isInArray = false;
        for (float element:marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("the value is present in the array");
        }
        else
        System.out.println("the value is not present in the array");*/
        //calc avrg marks in physics
        /*int [] marks= {10,20,30,40,50};
        int sum =0;
        for (int element:marks){
            sum = sum+element;
        }
        System.out.println("average marks in physics = " + sum/marks.length);*/
        //add two matrices
        /*int [][] mat1 = {{1,2,3},
                        {4,5,6}};
        int [][] mat2 = {{3,2,1},
                        {6,5,4}};
        int [][] result = {{0,0,0},
                          {0,0,0}};
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.format("setting value for i=%d and j=%d", i,j);
                System.out.println("\n");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
                System.out.println("\n");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }*/
        //reverse an array
        /*int [][] a ={{0,1,0,2,0,3,0,4,},
                       {1,2,3,4,5,6,7,8}};
        for (int b[]:a){
            for (int j:b){
                System.out.println(j);
            }
            System.out.println( " ");
        }*/
        // maximum element in array
        int [] arr= {1,2,50,88,90};
        int max=0;
        for (int e:arr){
            if (e>max){
                max=e;
            }
        }
        System.out.println("the maximum element in this array is: " + max);
        //find array is sorted or not
        int [] ary={1,5,122,555,856,999};
        boolean isSorted = true;
        for (int i=0;i<ary.length-1;i++){
            if (ary[i] > ary[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("this array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }
    }
}