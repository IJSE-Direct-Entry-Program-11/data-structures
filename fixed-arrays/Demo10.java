public class Demo10 {
    public static void main(String[] args) {
        int[][][] my3DArray = {
            {null, null},
            {null, {10,20}, null},
            {{10, 20}, null}
        };

        System.out.println(my3DArray[0].length);
        System.out.println(my3DArray[1].length);
    }
}
