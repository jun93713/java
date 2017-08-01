public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void add(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
        }
        else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void remove(){
        Node current = head;
        if (head == null){
            System.out.println("there is no head, nothing to remove");
        }
        else if (head.next == null){
            head.next = null;
        }
        else {
            while (current.next.next != null){
                current = current.next;
            }
            current.next =null;
        }
    }

    public void printValues(){
        Node current = head;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public Node find(int value){
        if (head != null){
            Node current = head;
            while (current != null){
                if (current.val == value){
                    return current;
                }
                current = current.next;
            }
        }
        return null;
    }

    public void removeAt(int number){
        Node current = head;
        int count = 0;
        if (head == null){
            System.out.println("there is no head so nothing to remove");
        }
        else {
            while(count < number - 1){
                if (current.next == null){
                    System.out.println("number is bigger than the size of SLL");
                    return;
                }
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
    }
}
