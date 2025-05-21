import java.util.ArrayList;
public class Member {
    String memberId;
    String name;
    String contactInfo;
    ArrayList<Book> booksBorrowed;;
    static ArrayList<Member> libraryMembers = new ArrayList<>();

    public Member(String memberId, String name, String contactInfo) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.booksBorrowed = new ArrayList<>();
        libraryMembers.add(this);
    }
    public Member searchMemberById(String memberId){
       for (Member member : libraryMembers){
           if (memberId.equalsIgnoreCase(member.getMemberId())){
               return member;
           }
       }
       return null;
    }

    public void borrowBook(String loanId , Member member , String bookId) {
        Loan.loanBorrowBook(loanId , member , bookId);
    }

    public void returnBook(String loanId , Member member , String bookId) {
        Loan.loanReturnBook(loanId , member , bookId);
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Member> getLibraryMembers() {
        return libraryMembers;
    }

    public static void setLibraryMembers(ArrayList<Member> libraryMembers) {
        Member.libraryMembers = libraryMembers;
    }

    public static void showMembers() {
        Sorting.mergeSort(libraryMembers);
        for (Member member : libraryMembers) {
            System.out.println(member.toString());
        }
    }
    public static void showBorrowedBooks(String memberId){
        for (Member member : libraryMembers){
            if (memberId.equalsIgnoreCase(member.getMemberId())){
                System.out.println(member.getBooksBorrowed());
            }
        }
    }

    public static void allMembers(){
        for (Member member : libraryMembers){
            System.out.println(member.toString());
}
}

    public ArrayList<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(Book book) {
        booksBorrowed.add(book);
    }

    public void removeBooksBorrowed(Book book){
        booksBorrowed.remove(book);
    }

    public String toString() {
        return
                "Member Id: " + memberId +
                        " , Name: " + name +
                        " , Contact Info: " + contactInfo +
                        " , Books Borrowed ID: " + booksBorrowed;
    }
}
