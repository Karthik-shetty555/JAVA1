import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Character> ll=new LinkedList<Character>();
        ll.add('B');
        ll.add('E');
        ll.add('F');
        System.out.println("Original Contents:"+ll);
        ll.addLast('G');
        ll.addFirst('A');
        System.out.println("\nAfter calls to addFirst() and addLast().");
        System.out.println("Contents: "+ll);
        ll.add(2,'D');
        ll.add(2,'C');
        System.out.println("\nAfter insertions");
        System.out.println("Contents: "+ll);
        System.out.println("\nHere are the first and last elements:"+ll.getFirst() + " " +ll.getLast());
        List<Character> sub=ll.subList(2,5);
        System.out.println("\nContents of sublist view:"+sub);
        LinkedList<Character> ll2=new LinkedList<Character>(sub);
        ll.removeAll(ll2);
        System.out.println("\nAfter removing ll2 from ll.");
        System.out.println("Contents:"+ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("\nAfter deleting fisrt and last element:");
        System.out.println("Contents:"+ll);
        ll.set(0,Character.toLowerCase(ll.get(0)));
        System.out.println("\nAfter change:"+ll);
        ll.push('Z');
        System.out.println("\nAfter Push"+ll);
        System.out.println("\nPollFirst"+ll.pollFirst());
        System.out.println("\nPeek First"+ll.peekFirst());
    }
}
