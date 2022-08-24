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
        if (this.last == null){
            this.last = node;
        } else {
            // Loop through list until next pointer is null
            Node temp = first;
            boolean isLast = false;
            while(!isLast){
                if(temp.next == null){
                    temp.next = node; // add to the end
                    last = node; // store last node pointer
                    isLast = true; // break loop
                }
                temp = temp.next;
            }

        }

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
