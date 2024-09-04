public class LLOperations{
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
    public static int size;

    public void addFirst(int data){//add to first position
        
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //step2 = tail's next = newNode
        tail.next = newNode;

        //step3 - tail = newNode
        tail = newNode;
    }

    //Print LL
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

    //Add in the middle of LL
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;    
    }


    //remove from first position
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;//can return MIN_VALUE also because we have to return a invalid value
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;//condition is for size=1 so we directly assigned the size=0 
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    //remove from last position
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;//can return MIN_VALUE also because we have to return a invalid value
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;//condition is for size=1 so we directly assigned the size=0 
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //Search in a Linked List
    public int itrSearch(int key){ //O(n)
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){//key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }


    //Search(Recursive)
    public int helper(Node head, int key){
        if(head == null){
            return 0;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key); //TC:O(n)  SC:O(n)-because of callstack will occupy the space
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }


    //Reverse a LL
    public void reverse(){//O(n)
        Node prev = null;
        Node curr = tail = head;//in java asignment is from left to right so at first head value is stored to tail and then it is stored in curr
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    //Find & Remove Nth Node from end
    public void deleteNth(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){//means from last we are reaching at head position so we directly remove head by writing this corner condition
            head = head.next;
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    //find middle of Linked List
    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }

    //Check Palindrome in LL
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;//in java asignment is from left to right so at first head value is stored to tail and then it is stored in curr
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;//as left half is not reverse so its head would be same as whole linked list code

        //step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    //Detect a Loop/Cycle in LL
    //Floyd's Cycle Finding Algorithm
    public static boolean isCycle(){
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

    //Remove Cycle from LL
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev = null; //last Node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next
        prev.next = null;
    }

    
    
    //Sorting of LinkedList using merge sort
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next; 
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next; 
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next; 
        }

        while(head2 != null){
            temp.next = head2;
            head1 = head1.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left & right MergeSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }


    //Zig-Zag LL 
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;


        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zig-Zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR; 
        }
    }




    public static void main(String args[]){
        LLOperations ll = new LLOperations();//object creation
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(4));
        // System.out.println(ll.recSearch(4));

        // ll.reverse();
        // ll.print();
        // ll.deleteNth(3);
        // ll.print();


        //for check palindrome input
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(2);
        // ll.print();
        // System.out.println(ll.checkPalindrome());


        //for detect loop input
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // //1->2->3->2
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());


        //for Sorting LL input
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        //5->4->3->2->1
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();


        //for Zig-Zag LL input
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);

        //1->2->3->4->5
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
