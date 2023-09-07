public class Demo11 {
    public static void main(String[] args) {
        
        int[] intArray = {10,20};
        int[][] intArrayArray = {intArray, null,  {-2,3,5}};

        int[][][][] myArray = {
            {{intArray, intArray, {5,7,8}}, null, intArrayArray},
            null , null , 
            {intArrayArray, null, null, intArrayArray} ,
        };

        System.out.println(myArray[0][0][0] == myArray[0][0][1]);
        System.out.println(myArray[0][0][0] == myArray[3][0][0]);
        System.out.println(myArray[0][0][0] == myArray[3][3][0]);

    }
}
