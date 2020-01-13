public class LinkedList{
    //composition Node
    private Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head==null){
            head = node;
        }else{
            //create a head start from the current head
            Node n = head;
            //go through the linked list to find the end
            while(n.next!=null){
                n = n.next;  
            }
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next!=null){  System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}