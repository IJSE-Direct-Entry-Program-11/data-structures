public class Demo4 {
    public static void main(String[] args) {
          
        int x = 10;
        int y;
        long myLong = 20;

        int[] myArray = new int[5];

        int[] myArray2 = myArray;

        String something = "IJSE";

        System.out.println(myArray == myArray2);

        System.out.println(myArray);
        System.out.println(myArray.toString());

        System.out.println(something);
        System.out.println(something.toString());

        Demo4 ref = new Demo4();
        System.out.println(ref.toString());
        System.out.println(ref);
    }

    @Override
    public String toString() {
        return "Hello DEP-11";
    }
 
}
