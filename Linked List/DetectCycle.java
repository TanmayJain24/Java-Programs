import org.w3c.dom.Node;

public class DetectCycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    } 
    //Detect a Loop/Cycle in LL
    public static Node head;
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; //Cycle exits
            }
        }
        return false; //Cycle doesnt exit
    }

    public static void main(String[] args) {
        DetectCycle ll = new DetectCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //1->2->3->1
        System.out.println(ll.isCycle());
    }
}
