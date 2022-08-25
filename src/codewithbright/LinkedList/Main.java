package codewithbright.LinkedList;



public class Main {
    public static void main(String[] args){
        LinkedList mylist = new LinkedList();
        mylist.addFirst(10);
        mylist.addLast(11);
        mylist.addLast(12);
        mylist.addLast(13);
        mylist.addFirst(25);
        System.out.println(mylist.index0f(11));
        mylist.printList();
    }
}
