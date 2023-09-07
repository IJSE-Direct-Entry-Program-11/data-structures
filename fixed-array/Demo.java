public class Demo {
    public static void main(String[] args) {
        // Fixed / Static Arrays ✅ (Built-in the Language)
        // Dynamic Arrays  ✅ (Java SE Library)

        // String name1 = "Kasun";
        // String name2 = "Ruwan";
        // String name3 = "Upul";
        // String name4 = "Supun";
        // String name5 = "Nimal";

        // System.out.println(name1);
        // System.out.println(name2);
        // System.out.println(name3);
        // System.out.println(name4);
        // System.out.println(name5);

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(name + i);
        // }

        String[] names = new String[5];
        names[0] = "Kasun";
        names[1] = "Nuwan";
        names[2] = "Ruwan";
        names[3] = "Supun";
        names[4] = "Nimal";

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

        System.out.println(names.length);

        int k = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("N")){
                k++;
            }
        }

        System.out.println(k);

        /*
            new DataType[size];

            new int[5];         int[]
            new char[10];       char[]
            new double[3];      double[]
            new Calendar[10];   Calendar[]
            new long[0];        long[]
            new String[0];      String[]

            In java, arrays are objects
            In java, arrays are categorized into reference data types
         */

         /* DataType identifier; */
         int myInt;
         myInt = 10;

         int[] myIntArrays;
         myIntArrays = new int[5];

         String[] myStrArrays;
         myStrArrays = new String[10];
    }
}