import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(30));      // true
        System.out.println(list.contains(100));     // false
        System.out.println(list.indexOf(30));       // 2
        System.out.println(list.lastIndexOf(30));   // 3
        System.out.println(list.remove(2));
        System.out.println(list);
        list.add(1, 15);
        System.out.println(list);
    }
}
