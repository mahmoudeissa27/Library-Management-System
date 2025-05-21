import java.time.LocalDate;
import java.util.ArrayList;
public class Loan {
    String loanId;
    String memberId;
    String bookId;
    LocalDate issueDate;


    LocalDate returnDate;
    static boolean isReturned;
    Member member;
    PendingRequestsQueue pendingRequestsQueue;
    static ArrayList<Loan> loans = new ArrayList<>();
    protected Loan(String loanId, String memberId, String bookId, LocalDate issueDate, LocalDate returnDate) {
        this.loanId = loanId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        isReturned = false;
        loans.add(this);
    }

    public static int loanBorrowBook(String loanId, Member member , String bookId) {
            Book book = Catalog.searchBookByBookId(bookId);
            if (book != null && book.getAvailabilityStatus() == AvailabilityStatus.available) {
                LocalDate issueDate = LocalDate.now();
                LocalDate returnDate = LocalDate.now().plusDays(14);
                new Loan(loanId, member.getMemberId(), bookId, issueDate, returnDate);
                book.setAvailabilityStatus(AvailabilityStatus.notAvailable);
                member.setBooksBorrowed(book);
                System.out.println("Book " + book.getTitle() + " borrowed successfully:  " + issueDate + "  You should return before:  " + returnDate);
                return 1;
            } else {
                if (book != null) {
                    System.out.println(" the book " + book.getTitle() + " is already borrowed your request is pending");
                    PendingRequestsQueue.addPendingRequest(book);
                    return 0;
                }else {
                    return 0;
                }
            }
    }

    public static boolean loanReturnBook(String loanId, Member member, String bookId) {
        if (searchLoan(loanId)) {
            Book book = Catalog.searchBookByBookId(bookId);
            if (book.getAvailabilityStatus() == AvailabilityStatus.notAvailable) {
                LocalDate returnDate = LocalDate.now();
                book.setAvailabilityStatus(AvailabilityStatus.available);
                System.out.println("Book " + book.getTitle() + " returned successfully  " + returnDate);
                isReturned =true;
                member.removeBooksBorrowed(book);
                return true;
            } else {
                System.out.println("The book " + book.getTitle() + " was not borrowed");
                return false;
            }
        }else {
            System.out.println("LOAN NOT FOUND !!");
            return false;
        }
    }

    public static void displayLoan() {
        if (loans.isEmpty()){
            System.out.println("THERE ARE NO LOANS !!");
        }else {
            Sorting.mergeSort1(loans);
            for (Loan loan : loans) {
                System.out.println(loan.toString());
            }
        }
    }
    public static boolean searchLoan(String loanId){
        for (Loan loan : loans){
            if (loanId.equalsIgnoreCase(loan.getLoanId())){
                return true;
            }
            return false;
        }
        return false;
    }
    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public String toString() {
        return "Loan Id: " + loanId +
                " , Member Id: " + memberId +
                " , Book Id: " + bookId +
                " , Issue Date: " + issueDate +
                " , Returned Date: " + returnDate +
                " , Is Returned: " + isReturned;
    }
}