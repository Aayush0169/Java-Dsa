class linkedList{
    // defining node for linkedlist
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

    public void addFirst(int data){
        //add in start of the linkedlist
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        //add in the last of the linked list
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if (head==null) {
            System.out.println("the list is empty!!");
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        // System.out.println();
    }

    public void addIndex(int index,int data){
        if (index==0) {
            addFirst(data);
            return;
        }
        else if (index<0) {
            System.out.println("invalid index!!");
            return;
        }

        Node newNode= new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.addFirst(5);
        ll.print();
        System.out.println();
        ll.addFirst(10);
        ll.print();
        System.out.println();
        
        ll.addLast(17);
        System.out.println();
        ll.addLast(19);

        
        ll.addIndex(-2, 3);
        System.out.println("after inseting in middle");
        ll.print();
        System.out.println("size: "+ll.size);
    }
}