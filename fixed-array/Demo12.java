public class Demo12 {
    public static void main(String[] args) {
        int[] array1 = {5, 7, 8};
        int[] array2 = {2, -3, 1};
        int[][] array3 = {array2, null, array2};
        int[][][] array4 = {null, null};

        int[][][][] myArray = {
            array4,
            array4,
            null,
            {{array1, null, array1}, null, array3},
            {{{10,20,30}, array2, array2}, null, array3, null},
            null
        };

        assert myArray.length == 6;
        assert myArray[0] == myArray[1];
        assert myArray[0].length == 2;
        assert myArray[3][2] == myArray[4][2];
        assert myArray[4][2][0] == myArray[4][2][2];
        assert myArray[3][0][0] == myArray[3][0][2];
        assert myArray[4][0][1] == myArray[4][0][2];

        System.out.println("Passed!");

    }
}
