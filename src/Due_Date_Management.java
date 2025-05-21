import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Due_Date_Management {


        public void sendReminder(LocalDate currentDate) {
            for (Loan loan : Loan.loans) { // استخدام القروض المخزنة في Loan.loans
                if (!loan.isReturned()) {
                    long daysUntilDue = loan.getReturnDate().toEpochDay() - currentDate.toEpochDay();
                    if (daysUntilDue <= 3 && daysUntilDue >= 0) {
                        System.out.println("Reminder: The due date for the book \"" + Catalog.searchBookByBookId(loan.getBookId()).getTitle()
                                + "\" is approaching on " + loan.getReturnDate()
                                + ". Borrower: " + loan.getMemberId());
                    }
                }
            }
        }

        public void handleOverdueBooks(LocalDate currentDate) {
            for (Loan loan : Loan.loans) {
                if (!loan.isReturned() && loan.getReturnDate().isBefore(currentDate)) {
                    System.out.println("Overdue: The book \"" + Catalog.searchBookByBookId(loan.getBookId()).getTitle()
                            + "\" is overdue. Borrower: " + loan.getMemberId());
                }
            }
        }

        public void returnBook(String loanId) {
            for (Loan loan : Loan.loans) {
                if (loan.getLoanId().equals(loanId) && !loan.isReturned()) {
                    loan.setReturned(true);
                    Book book = Catalog.searchBookByBookId(loan.getBookId());
                    if (book != null) {
                        book.setAvailabilityStatus(AvailabilityStatus.available);
                    }
                    System.out.println("The book \"" + book.getTitle() + "\" has been returned.");
                    return;
                }
            }
            System.out.println("The loan with ID \"" + loanId + "\" is not found or the book is already returned.");
        }

        public void displayLoans() {
            if (Loan.loans.isEmpty()) {
                System.out.println("There are no loans to display.");
            } else {
                for (Loan loan : Loan.loans) {
                    System.out.println(loan);
                }
            }
        }


    }





