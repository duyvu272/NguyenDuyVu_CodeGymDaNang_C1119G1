import java.util.Arrays;

public class ArrayList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int size) {
        this.size = size;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        } else {
            elements[size++] = e;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    public void add(E e, int index) {
        if (index > size || index < 0) {
            System.out.println("invalid number");
        } else if (size == elements.length - 1) {
            ensureCapa();
        } else {
            Object temp = elements[index];
            elements[index] = e;
            for (int i = index + 1; i < elements.length - 1; i++) {
                Object temp1 = elements[i];
                elements[i] = temp;
                temp = temp1;
            }
            size++;
        }
    }

    public void Remove(int index) {
        if (index > size || index < 0) {
            System.out.println("invalid Number");
        } else {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
        }
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (e == elements[i]) {
                index = i;
            }
        }
        return index;
    }

    public boolean contains(E e) {
        for (Object x : elements
        ) {
            if (x == e) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        if (elements[0] == null) {
            System.out.println("No element in List");
        } else {
            for (int i = 0; i < size; i++) {
                elements[i] = null;
            }
        }
    }

    public Object get(int i) {
        if (i > size || i < 0) {
            System.out.println("invalid");
            return null;
        }
        return elements[i];
    }
//    public boolean add(E e){
//        if(size==elements.length){
//            return  false;
//        }else {
//            elements[size++]=e;
//            return true;
//        }
//    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(8);
        a.display();
        System.out.println("\n");
        a.add(7, 2);
        a.display();
    }

}
