import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) {
        // int[][] my2DArray = new int[][]{{2,3,5} , {6,2,8} , {3, 1, 2} };
        int[][] my2DArray = { { 2, 3, 5 }, { 6, 2, 8 }, { 3, 1, 2 } };

        // int[] row1 = my2DArray[0];
        // int[] row2 = my2DArray[1];
        // int[] row3 = my2DArray[2];

        // row1[0] = 2;
        // row1[1] = 3;
        // row1[2] = 5;

        System.out.println(my2DArray[0]);
        System.out.println(my2DArray[1]);
        System.out.println(Arrays.toString(my2DArray[0]));
        System.out.println(Arrays.toString(my2DArray[1]));
        // System.out.println(my2DArray[1][1]);
    }
}
