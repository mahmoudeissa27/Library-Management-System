public class Catalog{
      static  LinkedListStack linkedListStack = new LinkedListStack();
    public static boolean addNewBook(String bookId, String title, String author , Genre genre ,AvailabilityStatus availabilityStatus){
        linkedListStack.push(new Book(bookId , title , author , genre , availabilityStatus));
        return true;
    }

    public static boolean updateAllBookDetails(String bookId ,String newTitle , String newAuthor , String newBookId , Genre newGenre , AvailabilityStatus newAvailabilityStatus){
        Book book = linkedListStack.searchByBookId(bookId);
        if (book != null){
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            book.setBookId(newBookId);
            book.setGenre(newGenre);
            book.setAvailabilityStatus(newAvailabilityStatus);
            System.out.println("Book details updated");
            return true;
        }else {
            System.out.println("Book not found");
            return false;
        }
    }
    public static boolean updateTitleBook(String bookId , String newTitle){
        Book book = linkedListStack.searchByBookId(bookId);
        if (book != null){
            book.setTitle(newTitle);
            System.out.println("Title updated");
            return true;
        }else{
            System.out.println("Book not found");
            return false;
        }
    }
    public static boolean updateAuthorBook(String bookId , String newAuthor){
        Book book = linkedListStack.searchByBookId(bookId);
        if (book != null){
            book.setAuthor(newAuthor);
            System.out.println("Author updated");
            return true;
        }else {
            System.out.println("Book not found");
            return false;
        }
    }
    public static boolean updateBookId(String bookId , String newBookId){
        Book book = linkedListStack.searchByBookId(bookId);
        if (book != null){
            book.setBookId(newBookId);
            System.out.println("Book Id updated");
            return true;
        }else {
            System.out.println("Book not found");
            return false;
        }
    }
    public static boolean updateBookAvailabilityStatus(String bookId , AvailabilityStatus availabilityStatus){
        Book book = linkedListStack.searchByBookId(bookId);
        if (book != null){
            book.setAvailabilityStatus(availabilityStatus);
            System.out.println("Book availability status updated");
            return true;
        }else {
            System.out.println("Book not found");
            return false;
        }
    }
    public static boolean updateBookGenre(String bookId , Genre genre){
        Book book = linkedListStack.searchByBookId(bookId);
        if (book != null){
            book.setGenre(genre);
            System.out.println("Book genre updated");
            return true;
        }else {
            System.out.println("Book not found");
            return false;
        }
    }
    public static boolean searchBookByTitle(String title){
        Book book = linkedListStack.searchByTitle(title);
        if (book != null){
            System.out.println("Book has found");
            System.out.println(book);
            return true;
        }else {
            System.out.println("Book not found ");
            return false;
        }
    }
    public static boolean searchBookByAuthor(String author) {
        Book book = linkedListStack.searchByAuthor(author);
        if (book != null) {
            System.out.println("Book has found");
            System.out.println(book);
            return true;
        } else {
            System.out.println("Book not found");
            return false;
        }
    }
    public static Book searchBookByBookId(String bookId){
        Book book = linkedListStack.searchByBookId(bookId);
        if (book != null) {
            System.out.println("Book has found");
            System.out.println(book);
            return book;
        }else {
            System.out.println("BOOK NOT FOUND !!");
            return null;
        }
    }
    public static void showAllBooks(){
        if (linkedListStack.isEmpty()){
            System.out.println("NO BOOKS !!");
        }else {
            Sorting.mergeSortByTitleF(linkedListStack);
            linkedListStack.printStack();
        }
    }
    public static void showAvailableBooks(){
       linkedListStack.printAvailableBooks();
    }
}
