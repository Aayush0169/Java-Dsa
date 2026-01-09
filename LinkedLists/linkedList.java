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

    public void addFirst(int data){
        //add in start of the linkedlist
        Node newNode=new Node(data);
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
        // System.out.print("null");
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
        ll.print();
        System.out.println();
        ll.addLast(19);
        ll.print();
    }
}