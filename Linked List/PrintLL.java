public class PrintLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){//add to first position
        
        //step1 = create new node
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head; //Link

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){//add to last position
        
        //step1 = create new node
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //step2 = tail's next = newNode
        tail.next = newNode;

        //step3 - tail = newNode
        tail = newNode;
    }

    public void print(){ //TC:-O(n)
        if(head == null){
            System.out.print("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        PrintLL ll = new PrintLL();//object creation
        ll.print();
        ll.addFirst(2);//TC:- O(1)
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);//TC:- O(1)
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
