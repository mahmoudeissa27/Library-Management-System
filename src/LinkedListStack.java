public class LinkedListStack {
    private Node top;
    public LinkedListStack(){
        top = null;
    }
    public void push(Book book){
        Node newBook = new Node(book);
        newBook.next = top;
        top = newBook;
    }
    public Book pop(){
        if (isEmpty()) {
            System.out.println("The stack is  empty");
        }
        Book book = top.book;
        top = top.next;
        return book;
    }
    public Book peek(){
        if (isEmpty()){
            System.out.println("The stack is  empty");
        }
        return top.book;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public  int size(){
        int count = 0;
        Node temp = top;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public Book searchByTitle(String title){
        Node temp = top;
        while (temp != null){
            if (temp.book.getTitle().equalsIgnoreCase(title)){
                return temp.book;
            }
            temp = temp.next;
        }
        return null;
    }
    public Book searchByAuthor(String author){
        Node temp = top;
        while (temp != null){
            if (temp.book.getAuthor().equalsIgnoreCase(author)){
                return temp.book;
            }
            temp = temp.next;
        }
        return null;
    }
    public Book searchByBookId(String bookId){
        Node temp = top;
        while (temp != null){
            if (temp.book.getBookId().equalsIgnoreCase(bookId)){
                return temp.book;
            }
            temp = temp.next;
        }
        return null;
    }
    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.book.toString());
            temp = temp.next;
        }
    }
    public void printAvailableBooks(){
        int count = 0;
        Node temp = top;
        while (temp != null){
            if (temp.book.getAvailabilityStatus()==AvailabilityStatus.available){
                System.out.println(temp.book.toString());
                count++;
            }
            temp = temp.next;
        }
        if (count == 0){
            System.out.println("THERE ARE NO AVAILABLE BOOKS !!");
        }
    }
}
