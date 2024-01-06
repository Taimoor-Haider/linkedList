import java.util.NoSuchElementException;

public class LL {
    private class Node {
        private int number;
        private Node next;

        public Node(int number) {
            this.number = number;
            this.next = null;
            size++;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        size=0;
    }
    public void addStart(int num) {
        var newNode = new Node(num);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addEnd(int num) {
        var newNode = new Node(num);
        if (head == null) {
           head=tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteFirst(){
        
    
        if(head == null){
            head=tail=null;
            size--;
        }
        var current=head.next;
        head=current;
        size--;
    }

    public void deleteLast(){
        var secondLast=head;
        var last=head.next;
        if(head==null){
            head=tail=null;
            return;
      
        }
        size--;
        if( head.next==null){
            head=tail=null;
                  return;
        }
        while (last.next != null) {
            last=last.next;
            secondLast=secondLast.next;
        
        }
        secondLast.next=null;
        tail=secondLast;
    }
    public void printList() {
        if(head==null){
            throw new NoSuchElementException();
        }
        var currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.number + "->");
            currentNode = currentNode.next;
        }
        System.out.print("NULL");
    }
public void reverseList() {
    if (head == null || head.next == null) {
        return;
    }

    Node previous = head;
    Node current = head.next;

    while (current != null) {
        Node next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }

    head.next = null;
    head = previous;  // Corrected order of these two lines
}

    public int getSize(){
        return size;
    }
}
