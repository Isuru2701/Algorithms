 class base {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(0);
        list.deleteHead();
        list.append(50);
        list.append(30);
        list.append(10);
        list.deleteTail();
        list.print();
    }    
}

class Node {
    int data;
    Node nextNode;

    public Node(int data) {
        this.data = data;
    }
}

class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList(int first) {

        head = new Node(first);
        head.nextNode = null;
    }

    //insert at front
    public void push(int value) {
        if(isEmpty()) {
            head = new Node(value);
        }

        //make new node
        //point this node to current head
        //change head to new node

        Node newNode = new Node(value);
        newNode.nextNode = head;
        head = newNode;
    }

    //insert after a node
    public void insertAfter(Node prev, int value) {

        if(prev == null) {
            return;
        }
        Node newNode = new Node(value);

        newNode.nextNode = prev.nextNode;
        prev.nextNode = newNode;
    }


    //add at the end
    public void append(int value) {
        //check if the tree is empty;
        if(isEmpty()) {
            head = new Node(value);
            return;
        }

        //iterate thru and insert at the null pointer
        //O(n)

        Node last = head;
        while(last.nextNode != null) {
            last = last.nextNode;
        }
        last.nextNode = new Node(value);

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void print() {
        Node node = head;

        while(node != null) {
            System.out.print(node.data + " ");
            node = node.nextNode;
        }
    }

    public void deleteHead(){
        head = head.nextNode;
    }
    
    public void deleteTail(){
        Node node = head;
        while(node.nextNode.nextNode != null){
            node = node.nextNode;
        }

        node.nextNode = null;
    }

    public void deleteAfter(Node node) {
        node.nextNode = node.nextNode.nextNode;
    }
}
