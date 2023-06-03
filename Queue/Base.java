public class Base {
    public static void main(String[] args) {
        PricesQueue q = new PricesQueue(5);

        q.enqueue(40);
        q.enqueue(30);
        q.enqueue(10);
        System.out.println(q.peek() + "\n");

        System.out.println(q.toString());

        System.out.println(q.toString());
        System.out.println(q.peek());
        System.out.println("is empty? "+ q.isEmpty());
        System.out.println("is full? " +q.isFull());

        q.clear();
        System.out.println("is empty? after clear: "+ q.isEmpty());
    }
}

class PricesQueue {
    
    private int[] store;
    private int front, rear;

    public PricesQueue(int length) {

        this.store = new int[length];

        this.front = -1;
        this.rear = -1;

    }

    public void enqueue(int num) {
        if(!isFull()) { 
        store[++rear] = num;
        }
        else {
            System.err.println("Queue is full");
        }

    }

    public int dequeue(){
        if(!isEmpty()) {
            int val = store[++front];
            return val;
            
        }
        else {
            return -1;
        }

    }

    public int peek() {
        if(front != store.length){
        return store[front];
        }
        else {
            return -1;
        }
    }

    public void clear() {
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return (front == rear)? true: false;
    }

    public boolean isFull() {
        return (rear == (store.length - 1))? true: false;
    }

    public String toString() {
        String q = "";
        
        for(int i = front; i < rear; ++i) {
            q += Integer.toString(store[i]) + "\n";
        }

        return q;
    }
}