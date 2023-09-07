public class Demo8 {
    public static void main(String[] args) {
        int[][] my2DArray = new int[3][3];

        int[] row1 = {2,3,5};
        int[] row2 = {6,2,8};
        int[] row3 = {3,1,1,10};

        //System.out.println(my2DArray[2][3]); // Error

        my2DArray[0] = row1;
        my2DArray[1] = row2;
        my2DArray[2] = row3;

        System.out.println(my2DArray[2][3]);

        System.out.println(my2DArray[1][1]);
    }
}
