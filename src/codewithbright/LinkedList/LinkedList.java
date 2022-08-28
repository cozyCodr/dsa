package codewithbright.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size = 0;

    public void addFirst(int data){
        Node node = new Node(data);
        //If linked list is empty
        if (first == null){
            // let first point to subject node
            this.first = node;
            setLast();
            size++;
        }
        else {
            // Let the subject node point to what first is pointing to
            node.next = first;
            // Set first to point to subject node
            first= node;
            size++;
        }
    }

    public void addLast(int data){
        Node node = new Node(data);
        // If empty, set node to currentLast
        if (first == null){
            first = last = node;
            size++;
        } else {
            // Loop through list until next pointer is null
            last.next = node;
            last = node;
            size++;
        }

    }

    public void deleteFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            size--;
            return;
        }
        var temp = first;
        first = first.next;
        temp.next = null;
        size--;
    }

    public void deleteLast(){
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            size--;
            return;
        }
        var temp = first;
        while (temp != null){
            assert temp.next != null;
            if (temp.next.next == null){
                temp.next = null;
                size--;
                break;
            }
            temp = temp.next;
        }

    }

    public int getKth(int k){
        if (isEmpty())
            throw new IllegalStateException("List is empty");
        var leftPointer = first; // Set first pointer
        var rightPointer = first;

        // Set second pointer
        for (int x = 0; x < k-1; x++){
            if(rightPointer == null){
                throw new IllegalArgumentException("K too large");
            }
            rightPointer = rightPointer.next;
        }

        // Reach end of list with second pointer
        while (rightPointer.next != null){
            rightPointer = rightPointer.next;
            leftPointer = leftPointer.next;
        }

        return leftPointer.data;
    }

    public boolean contains(int data){
        var temp = first;
        if (isEmpty()){
            return false;
        }

        while (temp != null){
            if (temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int index0f(int data){
        int count = -1;
        var temp = first;
        if (isEmpty()){
            return -1;
        }

        while (temp != null){
            if (temp.data == data){
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public int size(){
        return this.size;
    }

    public void reverse(){

        if (isEmpty()) return;

        Node current = first;
        Node prev = null;
        Node next = current.next;

        if (first.next == null)
            return;
        else {
            while (next != null){
                //check if current iteration is first node
                if (current == first) {
                    last = current;
                }
                //Check if next current iteration is last
                if (current.next == null){
                    first = current;
                }
                // Why make the "next" variable and not just use "current.next"
                // At some point we alter the "current.next" (current.next = prev) and lose its
                // original form, so we keep a temp value of the original form of "current" in "next"
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
        }
    }

    public int[] toArray() throws NoSuchMethodException {
        if(isEmpty())
            throw new NoSuchMethodException();

        int [] toArray = new int[size];
        var current = first;

        int index = 0;
        while (current != null){
            toArray[index++] = current.data;
            current = current.next;
        }

        return toArray;
    }

    public void setLast(){
        boolean isLast = false;
        Node subjectNode = first;
        while (!isLast){
            if (subjectNode.next == null){
                this.last = subjectNode;
                isLast = true;
            }
            else {
                subjectNode = subjectNode.next;
            }
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void printFirst(){
        System.out.println("first: " + first.data);
    }

    public void printLast(){
        System.out.println("last: " + last.data);
    }

    public void printList(){
        Node temp = first;
        boolean isLast = false;
        System.out.print("[");
        if (temp != null){
            while (!isLast) {
                if (temp.next == null){
                    System.out.print(temp.data);
                    isLast = true;
                } else {
                    System.out.print(temp.data + ", ");
                    temp = temp.next;
                }
            }
        }
        System.out.println("]");
    }
}
