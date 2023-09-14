public class Demo {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.size());    // 5
        System.out.println(list);           // [10, 20, 30, 40, 50]
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.remove(list.size() - 1));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        list.add(100);
        list.add(200);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        System.out.println(list);
        // list.clear();
        // System.out.println(list.size());    // 0
        // System.out.println(list);           // []
    }
}

interface MyList {
    void add(int value);

    void add(int index, int value) throws ArrayIndexOutOfBoundsException;

    int remove(int index) throws ArrayIndexOutOfBoundsException;

    void clear();

    int size();

    int get(int index) throws ArrayIndexOutOfBoundsException;

    int set(int index, int value) throws ArrayIndexOutOfBoundsException;

    boolean contains(int value);

    int indexOf(int value);

    int lastIndexOf(int value);
}

class MyLinkedList implements MyList {

    private int size;
    private MyNode head;
    private MyNode tail;

    public MyLinkedList(){}

    public MyLinkedList(int... values){}

    public static MyLinkedList of(int... values){ return null; }

    @Override
    public String toString() {
        String str = "[";
        MyNode temp = head;
        while (temp != null) {
            str += temp.value + (temp.next != null ? ", " : "");
            temp = temp.next;
        }
        str += "]";
        return str;
    }

    @Override
    public void add(int value) {
        if (size == 0){
            head = new MyNode(value, null);
            tail = head;
        } else {
            tail.next = new MyNode(value, tail);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public void add(int index, int value) throws ArrayIndexOutOfBoundsException {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int remove(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size) 
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);

        int value;
        if (index == 0){
            value = head.value;
            head = head.next;
            if (head != null){
                head.previous = null;
            }else{
                tail = head;
            }
        }else if (index == (size - 1)){
            value = tail.value;
            tail = tail.previous;
            tail.next = null;
        }else {
            MyNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            value = temp.next.value;
            temp.next.next.previous = temp;
            temp.next= temp.next.next;
        }
        size--;
        return value;
    }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int set(int index, int value) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size) 
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);

        MyNode temp = head;    
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        int tempValue = temp.value;
        temp.value = value;
        return tempValue;
    }

    @Override
    public boolean contains(int value) {
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public int indexOf(int value) {
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(int value) {
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

}

class MyNode {
    MyNode previous;
    MyNode next;
    int value;

    public MyNode(int value, MyNode previous){
        this.value = value;
        this.previous = previous;
    }

    public MyNode(int value, MyNode previous, MyNode next){
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}