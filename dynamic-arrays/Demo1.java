import java.util.*;

public class Demo1 {

    public static void main(String[] args) {
        // Fixed Arrays (Java Language)

        // Dynaimic Arrays (Java SE Library)
        // 1. Vector (Legacy) (Thread-safe, but low peformance)
        // 2. ArrayList (New) (Not thread-safe, but high peformance)

        int[] myInts = new int[5];
        String[] myStrings = new String[5];

        Vector<Integer> myVector = new Vector<>();
        ArrayList<String> myArrayList = new ArrayList<>();

        // Add
        myVector.add(3);
        myVector.add(1);
        myVector.add(2);

        myArrayList.add("ijse");
        myArrayList.add("dep");
        myArrayList.add("cmjd");
        myArrayList.add("gdse");

        System.out.println(myVector);
        System.out.println(myArrayList);

        // Remove by index
        myVector.remove(1);
        myArrayList.remove(2);

        System.out.println(myVector);
        System.out.println(myArrayList);

        // Remove by value

        // You can't remove elements by value from dyanmic integer (Byte,Integer,Long) arrays

        // myVector.remove(10);    
        myArrayList.remove("ijse");

        System.out.println(myVector);
        System.out.println(myArrayList);

        // Size
        System.out.println(myVector.size());
        System.out.println(myArrayList.size());

        // Contains
        System.out.println(myVector.contains(3));
        System.out.println(myVector.contains(10));
        System.out.println(myArrayList.contains("dep"));
        System.out.println(myArrayList.contains("ijse"));

        // indexOf
        System.out.println(myVector.indexOf(3));
        System.out.println(myVector.indexOf(10));   // -1
        System.out.println(myArrayList.indexOf("dep"));
        System.out.println(myArrayList.indexOf("gdse"));
        System.out.println(myArrayList.indexOf("ijse"));    // -1

        // clear
        myVector.clear();
        myArrayList.clear();

        System.out.println(myVector);
        System.out.println(myArrayList);
    }
}