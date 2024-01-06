public class App {
    public static void main(String[] args) throws Exception {
        LL list=new LL();
        list.addStart(10);
        list.addStart(20);
        list.addEnd(30);
        list.addStart(40);
        list.addEnd(50);
        list.printList();

        // list.deleteFirst();
        // System.out.println();
        // list.printList();

        // list.deleteLast();
        //  System.out.println();
        // list.printList();
        // System.out.println();
        // System.out.println(list.getSize());
        list.reverseList();
        System.out.println();
        list.printList();


    }
}
