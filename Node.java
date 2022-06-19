public class Node{
    public char data;
    public Node next;

    //constructors from page 956
    public Node()
    {
        this('\0',null);  //'\0' is null char for java
    }

    public Node(char initialData, Node initialNext)
    {
        data = initialData;
        next = initialNext;
    }

    public void addNodeAfter(char element)
    {
        next = new Node(element, next);
    }

    public char getData()
    {
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node n){
        next = n;
    }

    public void setData(char d){
        data = d;
    }
}