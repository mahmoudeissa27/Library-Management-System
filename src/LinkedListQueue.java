public class LinkedListQueue {
    private Node front;
    private Node rear;
    public LinkedListQueue(){
        front = rear = null;
    }
    public void enqueue(Book book) {
        Node newBook = new Node(book);
        if (rear != null) {
            rear.next = newBook;
        }
        rear = newBook;
        if (front == null) {
            front = rear;
        }
    }

    public Book dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is  empty");
            return null;
        }
        Book book = front.book;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return book;
    }

    public Book peek() {
        if (isEmpty()) {
            System.out.println("Queue is  empty");
            return null;
        }
        return front.book;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        int count = 0;
        Node temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void printQueue(){
        if (!isEmpty()) {
            Node temp = front;
            while (temp != null){
                System.out.println(temp.book);
                temp = temp.next;
            }
        }
    }
}
