package lr9.task4_5.Example6;

public class Example6 {
    public static void main(String[] args) {
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node0.next=node1;
        node1.next=node2;
        node2.next=node3;

        Node ref = node0;
        while (ref!=null) {
            System.out.print(" "+ref.value);
            ref = ref.next;
        }
        System.out.println("\n");

        //второй вариант
        Node head = null;
        for (int i = 9; i>=0; i--){
            head = new Node(i, head);
        }
        ref = head;
        while(ref !=null){
            System.out.print(" "+ref.value);
            ref = ref.next;
        }

        head = null;
        Node tail= null;
        for (int i = 0; i < 10; i++) {
            Node newNode = new Node(i, null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next =newNode;
                tail = newNode;
            }
        }
        System.out.println("\n");
        ref=head;
        while (ref!=null){
            System.out.print(" "+ref.value);
            ref=ref.next;
        } 
    }
}
