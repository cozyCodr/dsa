package codewithbright.LinkedList;



public class Main {
    public static void main(String[] args){
        LinkedList myList = new LinkedList();
        myList.addFirst(10);
        myList.addLast(11);
        myList.addLast(12);
        myList.addLast(13);
        myList.addFirst(25);
        myList.addLast(20);
        myList.printList();
        System.out.println(myList.getKth(5));
    }
}
