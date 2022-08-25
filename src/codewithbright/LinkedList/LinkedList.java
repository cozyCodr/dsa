package codewithbright.LinkedList;

public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(int data){
        Node node = new Node(data);
        //If linked list is empty
        if (first == null){
            // let first point to subject node
            this.first = node;
            setLast();
        }
        else {
            // Let the subject node point to what first is pointing to
            node.next = first;
            // Set first to point to subject node
            first= node;
        }
    }

    public void addLast(int data){
        Node node = new Node(data);
        // If empty, set node to currentLast
        if (first == null){
            first = last = node;
        } else {
            // Loop through list until next pointer is null
            last.next = node;
            last = node;
        }

    }

    public void deleteFirst(){
        if (isEmpty()){
            return;
        }
        var temp = first;
        first = first.next;
        temp.next = null;
    }

    public void deleteLast(){
        if(isEmpty()) {
            return;
        }
        var temp = first;
        while (temp != null){
            assert temp.next != null;
            if (temp.next.next == null){
                temp.next = null;
                break;
            }
            temp = temp.next;
        }

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
