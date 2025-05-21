import java.util.Scanner;
public class MemberInterface {
    Scanner sc = new Scanner(System.in);
    public void MemberInterfaceMenu(Member member) {
        int num = -1, choice = -1;
        boolean validInput ;
        do {
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("WELCOME: " + member.getName());
                    System.out.println("1. Browse Catalog\n2. Borrow Book\n3. Return Book\n4. Display Available Books\n5. Display Borrowed Books\n0. Exit");
                    System.out.print("Enter number: ");
                    num = sc.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Please try again and enter just numbers");
                    sc.nextLine();
                }
            }
            if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 0) {
                if (num == 1) {
                    Catalog.showAllBooks();
                } else if (num == 2) {
                    System.out.print("Enter loan ID: ");
                    String loanId = sc.next();
                    System.out.print("Enter book ID: ");
                    String bookId = sc.next();
                    member.borrowBook(loanId, member, bookId);
                } else if (num == 3) {
                    System.out.print("Enter loan ID: ");
                    String loanId = sc.next();
                    System.out.print("Enter book ID: ");
                    String bookId = sc.next();
                    member.returnBook(loanId, member, bookId);
                } else if (num == 4) {
                    Catalog.showAvailableBooks();
                } else if (num == 5) {
                    Member.showBorrowedBooks(member.getMemberId());
                } else {
                }
            } else {
                do {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.print("Invalid Number try again :");
                            System.out.println("1. Browse Catalog\n2. Borrow Book\n3. Return Book\n4. Display Available Books\n5. Display Borrowed Books\n0. Exit");
                            System.out.print("Enter number: ");
                            num = sc.nextInt();
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Please try again and enter just numbers");
                            sc.nextLine();
                        }
                    }
                    if (num == 1) {
                        Catalog.showAllBooks();
                    } else if (num == 2) {
                        System.out.print("Enter loan ID: ");
                        String loanId = sc.next();
                        System.out.print("Enter book ID: ");
                        String bookId = sc.next();
                        member.borrowBook(loanId, member, bookId);
                    } else if (num == 3) {
                        System.out.print("Enter loan ID: ");
                        String loanId = sc.next();
                        System.out.print("Enter book ID: ");
                        String bookId = sc.next();
                        member.returnBook(loanId, member, bookId);
                    } else if (num == 4) {
                        Catalog.showAvailableBooks();
                    } else if (num == 5) {
                        Member.showBorrowedBooks(member.getMemberId());
                    } else if (num == 0) {
                    }
                } while (num != 1 && num != 2 && num != 3 && num != 4 && num != 5);
            }
        }while (num !=0);
    }
}