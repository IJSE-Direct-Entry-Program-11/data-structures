import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {
        
        /* Array Declaration */
        // DataType[]       identifier;     1 - Dimension (1D)
        // DataType[][]     identifier;     2D (Matrix | Matrices)
        // DataType[][][]   identifier;     3 - Dimensions (3D)
        // DataType[][][][] identifier;     4D

        /* Array Creation */
        // new DataType[size];                          1D
        // new DataType[size][[size]];                  2D
        // new DataType[size][[size]][[size]];          3D
        // new DataType[size][[size]][[size]][[size]];  4D

        // size = {0, postive number}

        int[] my1DArray = new int[5];
        int[][] my2DArray = new int[3][];
        my2DArray[1] = my1DArray;

        System.out.println(my1DArray);
        System.out.println(Arrays.toString(my1DArray));
        System.out.println(Arrays.toString(my2DArray));

        my2DArray[1][0] = 5;
        System.out.println(Arrays.toString(my1DArray));
        my1DArray[2] = 10;
        System.out.println(my2DArray[1][2]);
        System.out.println(Arrays.toString(my2DArray[1]));
    }
}
