public class reverse {
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

    public void add(int data){
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
    }
}
