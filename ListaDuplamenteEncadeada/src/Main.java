
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SLinkedList<String> list = new SLinkedList<String>();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.add(4, "g");
        list.addLast("f");
        System.out.println("first: " + list.getFirst());
        System.out.println("last: " + list.getLast());
        System.out.println("4: " + list.get(4));
        System.out.println(Arrays.toString(list.toArray()));


        /*list.addFirst("a");
        list.addLast("b");
        list.addLast("c");
        list.removeFirst();
        System.out.println(Arrays.toString(list.toArray()));*/

    }
}