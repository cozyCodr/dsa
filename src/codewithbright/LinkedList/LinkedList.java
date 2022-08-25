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

    public int index0f(int data){
        int count = 0;
        var temp = first;
        if (temp == null){
            return -1;
        }

        while (temp != null){
            if (temp.data == data){
                return --count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
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
