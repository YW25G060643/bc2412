public class LinkedList {//a link of Integers
    private Node head;

    public LinkedList(Node head){
        this.head = head;
    }

    public void add(int value){//add to tail
        Node first = head;
        while (first.next() != null) {
            first = first.next();
        }
        first.setNode(new Node(value));
    }

    public void remove(){//remove the head node
        //
    }

    public int size(){
        int count = 0;
        Node first =this.head;
        while (first != null) {
          
        }
    }

    public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.add(10);
      ll.add(20);
      System.out.println(ll.size());
    }
}
