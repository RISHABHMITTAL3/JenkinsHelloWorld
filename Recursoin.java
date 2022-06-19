
import java.util.LinkedList;

public class Recursoin
{
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
    }
    public static int lengthOfList(Node head)
    {
        if(head == null)
        {
            return 0;
        }
        else
        {
            return 1+ lengthOfList(head.next);
        }
    }

    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(4);
        llist.push(2);
        llist.push(6);
        llist.push(45);
        //System.out.println("Count of nodes is = "+ lengthOfList(llist.head));

    }
}