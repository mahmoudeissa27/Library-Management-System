import java.util.Scanner;

public class LibrarianInterface {
    private Scanner sc = new Scanner(System.in);
    private Loan loan;

    private int addBook() {
        int genre = -1;
        int availabilityStatus = -1;
        String bookId ;
        String title;
        String author;
        boolean validInput;
        validInput = false;
                System.out.print("Enter book title: ");
                title = sc.next();
                System.out.print("Enter book author: ");
                author = sc.next();
                System.out.print("Enter book id: ");
                bookId = sc.next();
        while (!validInput) {
            try {
                System.out.println("1. Drama\n2. Comedy\n3. Fantasy\n4. ScienceFiction");
                System.out.print("Enter book genre: ");
                genre = sc.nextInt();
                validInput = true;
            }catch (Exception e){
                System.out.println("Please try again and enter just numbers");
                sc.nextLine();
            }
        }
        if (genre == 1 || genre == 2 || genre == 3 || genre == 4) {
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("1. Available\n2. NotAvailable ");
                    System.out.print("Enter book availability status : ");
                    availabilityStatus = sc.nextInt();
                    validInput = true;
                }catch (Exception e){
                    System.out.println("Please try again and enter just numbers");
                    sc.nextLine();
                }
            }
            if (availabilityStatus == 1 || availabilityStatus == 2) {
                if (genre == 1 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Drama, AvailabilityStatus.available);
                } else if (genre == 1 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Drama, AvailabilityStatus.notAvailable);
                } else if (genre == 2 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Comedy, AvailabilityStatus.available);
                } else if (genre == 2 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Comedy, AvailabilityStatus.notAvailable);
                } else if (genre == 3 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Fantasy, AvailabilityStatus.available);
                } else if (genre == 3 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Fantasy, AvailabilityStatus.notAvailable);
                } else if (genre == 4 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.ScienceFiction, AvailabilityStatus.available);
                } else if (genre == 4 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.ScienceFiction, AvailabilityStatus.notAvailable);
                }
                System.out.println("Book added to catalog");
            } else {
                do {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Invalid number try again ");
                            System.out.println("1. Available\n2. NotAvailable\n0. Exit ");
                            System.out.print("Enter book availability status : ");
                            availabilityStatus = sc.nextInt();
                            validInput = true;
                        }catch (Exception e){
                            System.out.println("Please try again and enter just numbers");
                            sc.nextLine();
                        }
                    }
                    if (availabilityStatus == 0) {
                        return 0;
                    }
                } while (availabilityStatus != 1 && availabilityStatus != 2);
                if (genre == 1 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Drama, AvailabilityStatus.available);
                } else if (genre == 1 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Drama, AvailabilityStatus.notAvailable);
                } else if (genre == 2 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Comedy, AvailabilityStatus.available);
                } else if (genre == 2 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Comedy, AvailabilityStatus.notAvailable);
                } else if (genre == 3 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Fantasy, AvailabilityStatus.available);
                } else if (genre == 3 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Fantasy, AvailabilityStatus.notAvailable);
                } else if (genre == 4 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.ScienceFiction, AvailabilityStatus.available);
                } else if (genre == 4 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.ScienceFiction, AvailabilityStatus.notAvailable);
                }
                System.out.println("Book added to catalog");
            }
        } else {
            do {
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.println("Invalid number try again ");
                        System.out.println("1. Drama\n2. Comedy\n3. Fantasy\n4. ScienceFiction\n0. Exit");
                        System.out.print("Enter book genre: ");
                        genre = sc.nextInt();
                        validInput = true;
                    }catch (Exception e){
                        System.out.println("Please try again and enter just numbers");
                        sc.nextLine();
                    }
                }
                if (genre == 0) {
                    return 0;
                }
            } while (genre != 1 && genre != 2 && genre != 3 && genre != 4);
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("1. Available\n2. NotAvailable ");
                    System.out.print("Enter book availability status : ");
                    availabilityStatus = sc.nextInt();
                    validInput = true;
                }catch (Exception e){
                    System.out.println("Please try again and enter just numbers");
                    sc.nextLine();
                }
            }
            if (availabilityStatus == 1 || availabilityStatus == 2) {
                if (genre == 1 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Drama, AvailabilityStatus.available);
                } else if (genre == 1 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Drama, AvailabilityStatus.notAvailable);
                } else if (genre == 2 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Comedy, AvailabilityStatus.available);
                } else if (genre == 2 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Comedy, AvailabilityStatus.notAvailable);
                } else if (genre == 3 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Fantasy, AvailabilityStatus.available);
                } else if (genre == 3 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Fantasy, AvailabilityStatus.notAvailable);
                } else if (genre == 4 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.ScienceFiction, AvailabilityStatus.available);
                } else if (genre == 4 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.ScienceFiction, AvailabilityStatus.notAvailable);
                }
                System.out.println("Book added to catalog");
            } else {
                do {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Invalid number try again ");
                            System.out.println("1. Available\n2. NotAvailable\n 0. Exit");
                            System.out.print("Enter book availability status : ");
                            availabilityStatus = sc.nextInt();
                            validInput = true;
                        }catch (Exception e){
                            System.out.println("Please try again and enter just numbers");
                            sc.nextLine();
                        }
                    }
                    if (availabilityStatus == 0) {
                        return 0;
                    }
                } while (availabilityStatus != 1 && availabilityStatus != 2);
                if (genre == 1 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Drama, AvailabilityStatus.available);
                } else if (genre == 1 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Drama, AvailabilityStatus.notAvailable);
                } else if (genre == 2 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Comedy, AvailabilityStatus.available);
                } else if (genre == 2 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Comedy, AvailabilityStatus.notAvailable);
                } else if (genre == 3 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.Fantasy, AvailabilityStatus.available);
                } else if (genre == 3 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.Fantasy, AvailabilityStatus.notAvailable);
                } else if (genre == 4 && availabilityStatus == 1) {
                    Catalog.addNewBook(bookId, title, author, Genre.ScienceFiction, AvailabilityStatus.available);
                } else if (genre == 4 && availabilityStatus == 2) {
                    Catalog.addNewBook(bookId, title, author, Genre.ScienceFiction, AvailabilityStatus.notAvailable);
                }
                System.out.println("Book added to catalog");
            }
        }
        return 1;
    }

    private int updateTitleBook() {
        String newTitle;
        System.out.print("Enter book id: ");
        String bookId = sc.next();
        Book book = Catalog.searchBookByBookId(bookId);
        if (book != null) {
            System.out.print("Enter new book title: ");
            newTitle = sc.next();
            book.setTitle(newTitle);
            System.out.println("Book Title updated successfully");
            System.out.println("New Book " + book);
        } else {
            do {
                System.out.println("to Exit enter 0 ");
                System.out.print("Enter book id: ");
                bookId = sc.next();
                book = Catalog.searchBookByBookId(bookId);
            } while (book == null && !bookId.equalsIgnoreCase("0"));
            if (bookId.equalsIgnoreCase("0")) {

            } else {
                System.out.print("Enter new book title: ");
                newTitle = sc.next();
                book.setTitle(newTitle);
                System.out.println("Book Title updated successfully");
                System.out.println("New Book " + book);
            }
        }
        return 1;
    }

    private int updateAuthorBook() {
        String newAuthor;
        System.out.print("Enter book id: ");
        String bookId = sc.next();
        Book book = Catalog.searchBookByBookId(bookId);
        if (book != null) {
            System.out.print("Enter new book author: ");
            newAuthor = sc.next();
            book.setAuthor(newAuthor);
            System.out.println("Book Author updated successfully");
            System.out.println("New Book " + book);
        } else {
            do {
                System.out.println("to Exit enter 0 ");
                System.out.print("Enter book id: ");
                bookId = sc.next();
                book = Catalog.searchBookByBookId(bookId);
            } while (book == null && !bookId.equalsIgnoreCase("0"));
            if (bookId.equalsIgnoreCase("0")) {

            } else {
                System.out.print("Enter new book author: ");
                newAuthor = sc.next();
                book.setAuthor(newAuthor);
                System.out.println("Book Author updated successfully");
                System.out.println("New Book " + book);
            }
        }
        return 1;
    }

    private int updateBookId() {
        String newBookId;
        System.out.print("Enter book id: ");
        String bookId = sc.next();
        Book book = Catalog.searchBookByBookId(bookId);
        if (book != null) {
            System.out.print("Enter New Book Id: ");
            newBookId = sc.next();
            book.setBookId(newBookId);
            System.out.println("Book Id updated successfully");
            System.out.println("New Book " + book);
        } else {
            do {
                System.out.println("to Exit enter 0 ");
                System.out.print("Enter book id: ");
                bookId = sc.next();
                book = Catalog.searchBookByBookId(bookId);
            } while (book == null && !bookId.equalsIgnoreCase("0"));
            if (bookId.equalsIgnoreCase("0")) {
            } else {
                System.out.print("Enter new book ID: ");
                newBookId = sc.next();
                book.setBookId(newBookId);
                System.out.println("Book Id updated successfully");
                System.out.println("New Book " + book);
            }
        }
        return 1;
    }

    private int updateBookAvailabilityStatus() {
        int availabilityStatus = -1;
        boolean validInput;
        System.out.print("Enter Book Id: ");
        String bookId = sc.next();
        Book book = Catalog.searchBookByBookId(bookId);
        if (book != null) {
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("1. Available\n2. NotAvailable ");
                    System.out.print("Enter book availability status : ");
                    availabilityStatus = sc.nextInt();
                    validInput = true;
                }catch (Exception e){
                    System.out.println("Please try again and enter just numbers");
                    sc.nextLine();
                }
            }
            if (availabilityStatus == 1 || availabilityStatus == 2) {
                if (availabilityStatus == 1) {
                    book.setAvailabilityStatus(AvailabilityStatus.available);
                } else {
                    book.setAvailabilityStatus(AvailabilityStatus.notAvailable);
                }
                System.out.println("Book Availability Status updated successfully");
                System.out.println("New Book " + book);
            } else {
                do {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("to Exit enter 0 ");
                            System.out.println("1. Available\n2. NotAvailable");
                            System.out.print("Enter book availability status : ");
                            availabilityStatus = sc.nextInt();
                            validInput = true;
                        }catch (Exception e){
                            System.out.println("Please try again and enter just numbers");
                            sc.nextLine();
                        }
                    }
                    if (availabilityStatus == 0) {
                        break;
                    }
                } while (availabilityStatus != 1 && availabilityStatus != 2);
                if (availabilityStatus == 0) {

                } else {
                    if (availabilityStatus == 1) {
                        book.setAvailabilityStatus(AvailabilityStatus.available);
                    } else {
                        book.setAvailabilityStatus(AvailabilityStatus.notAvailable);
                    }
                    System.out.println("Book Availability Status updated successfully");
                    System.out.println("New Book " + book);
                }
            }
        } else {
            do {
                System.out.println("to Exit enter 0 ");
                System.out.print("Enter book id: ");
                bookId = sc.next();
                book = Catalog.searchBookByBookId(bookId);
            } while (book == null && !bookId.equalsIgnoreCase("0"));
            if (bookId.equalsIgnoreCase("0")) {
            } else {
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.println("1. Available\n2. NotAvailable ");
                        System.out.print("Enter book availability status : ");
                        availabilityStatus = sc.nextInt();
                        validInput = true;
                    }catch (Exception e){
                        System.out.println("Please try again and enter just numbers");
                        sc.nextLine();
                    }
                }
                if (availabilityStatus == 1 || availabilityStatus == 2) {
                    if (availabilityStatus == 1) {
                        book.setAvailabilityStatus(AvailabilityStatus.available);
                    } else {
                        book.setAvailabilityStatus(AvailabilityStatus.notAvailable);
                    }
                    System.out.println("Book Availability Status updated successfully");
                    System.out.println("New Book " + book);
                } else {
                    do {
                        validInput = false;
                        while (!validInput) {
                            try {
                                System.out.println("to Exit enter 0 ");
                                System.out.println("1. Available\n2. NotAvailable");
                                System.out.print("Enter book availability status : ");
                                availabilityStatus = sc.nextInt();
                                validInput = true;
                            }catch (Exception e){
                                System.out.println("Please try again and enter just numbers");
                                sc.nextLine();
                            }
                        }
                        if (availabilityStatus == 0) {
                            break;
                        }
                    } while (availabilityStatus != 1 && availabilityStatus != 2);
                    if (availabilityStatus == 1) {
                        book.setAvailabilityStatus(AvailabilityStatus.available);
                    } else {
                        book.setAvailabilityStatus(AvailabilityStatus.notAvailable);
                    }
                    System.out.println("Book Availability Status updated successfully");
                    System.out.println("New Book " + book);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    private int updateBookGenre() {
        int genre = -1;
        String bookId;
        boolean validInput;
        System.out.print("Enter Book Id: ");
        bookId = sc.next();
        Book book = Catalog.searchBookByBookId(bookId);
        if (book != null) {
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("1. Drama\n2. Comedy\n3. Fantasy\n4. ScienceFiction\n0. Exit");
                    System.out.print("Enter book genre: ");
                    genre = sc.nextInt();
                    validInput = true;
                }catch (Exception e){
                    System.out.println("Please try again and enter just numbers");
                    sc.nextLine();
                }
            }
            if (genre == 0) {
                return 1;
            }
            if (genre == 1 || genre == 2 || genre == 3 || genre == 4) {
                if (genre == 1) {
                    book.setGenre(Genre.Drama);
                } else if (genre == 2) {
                    book.setGenre(Genre.Comedy);
                } else if (genre == 3) {
                    book.setGenre(Genre.Fantasy);
                } else {
                    book.setGenre(Genre.ScienceFiction);
                }
                System.out.println("Book Genre updated successfully");
                System.out.println("New Book " + book);
            } else {
                do {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("to Exit enter 0 ");
                            System.out.println("1. Drama\n2. Comedy\n3. Fantasy\n4. ScienceFiction");
                            System.out.print("Enter book genre: ");
                            genre = sc.nextInt();
                            validInput = true;
                        }catch (Exception e){
                            System.out.println("Please try again and enter just numbers");
                            sc.nextLine();
                        }
                    }
                    if (genre == 0) {
                        break;
                    }
                } while (genre != 1 && genre != 2 && genre != 3 && genre != 4);
                if (genre == 0) {
                } else {
                    if (genre == 1) {
                        book.setGenre(Genre.Drama);
                    } else if (genre == 2) {
                        book.setGenre(Genre.Comedy);
                    } else if (genre == 3) {
                        book.setGenre(Genre.Fantasy);
                    } else {
                        book.setGenre(Genre.ScienceFiction);
                    }
                    System.out.println("Book Genre updated successfully");
                    System.out.println("New Book " + book);
                }
            }
        } else {
            do {
                System.out.println("to Exit enter 0 ");
                System.out.print("Enter Book Id : ");
                bookId = sc.next();
                book = Catalog.searchBookByBookId(bookId);
            } while (book == null && !bookId.equalsIgnoreCase("0"));
            if (bookId.equalsIgnoreCase("0")) {
            } else {
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.println("to Exit enter 0 ");
                        System.out.println("1. Drama\n2. Comedy\n3. Fantasy\n4. ScienceFiction");
                        System.out.print("Enter book genre: ");
                        genre = sc.nextInt();
                        validInput = true;
                    }catch (Exception e){
                        System.out.println("Please try again and enter just numbers");
                        sc.nextLine();
                    }
                }
                if (genre == 0) {
                } else {
                    if (genre == 1) {
                        book.setGenre(Genre.Drama);
                    } else if (genre == 2) {
                        book.setGenre(Genre.Comedy);
                    } else if (genre == 3) {
                        book.setGenre(Genre.Fantasy);
                    } else {
                        book.setGenre(Genre.ScienceFiction);
                    }
                    System.out.println("Book Genre updated successfully");
                    System.out.println("New Book " + book);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public void viewStatusOfBookLoans() {
        loan.displayLoan();
    }

    public void LibraryManagementMenu() {
        int num =-1 , choice = -1;
        boolean validInput ;
        do {
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("1. Add Book");
                    System.out.println("2. Update Book Details");
                    System.out.println("3. View Status of Book Loans");
                    System.out.println("0. Exit");
                    System.out.print("Enter your choice: ");
                    num = sc.nextInt();
                    validInput = true;
                }catch (Exception e){
                    System.out.println("Please try again and enter just numbers");
                    sc.nextLine();
                }
            }
            if (num <= 3 && num >= 0) {
                if (num == 1) {
                    num = addBook();
                } else if (num == 2) {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("1. Update Book Title");
                            System.out.println("2. Update Book Author");
                            System.out.println("3. Update Book Id");
                            System.out.println("4. Update Book Availability Status");
                            System.out.println("5. Update Book Genre");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            choice = sc.nextInt();
                            validInput = true;
                        }catch (Exception e){
                            System.out.println("Please try again and enter just numbers");
                            sc.nextLine();
                        }
                    }
                    if (choice <= 5 && choice >= 0) {
                        if (choice == 1) {
                            num = updateTitleBook();
                        } else if (choice == 2) {
                            num = updateAuthorBook();
                        } else if (choice == 3) {
                            num = updateBookId();
                        } else if (choice == 4) {
                            num = updateBookAvailabilityStatus();
                        } else if (choice == 5) {
                            num = updateBookGenre();
                        }
                    } else {
                        do {
                            validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.println("Invalid Number try again");
                                    System.out.println("1. Update Book Title");
                                    System.out.println("2. Update Book Author");
                                    System.out.println("3. Update Book Id");
                                    System.out.println("4. Update Book Availability Status");
                                    System.out.println("5. Update Book Genre");
                                    System.out.println("0. Exit");
                                    System.out.print("Enter your choice: ");
                                    choice = sc.nextInt();
                                    validInput = true;
                                }catch (Exception e){
                                    System.out.println("Please try again and enter just numbers");
                                    sc.nextLine();
                                }
                            }
                            if (choice == 0) {
                                break;
                            }
                        } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
                        if (choice == 1) {
                            num = updateTitleBook();
                        } else if (choice == 2) {
                            num = updateAuthorBook();
                        } else if (choice == 3) {
                            num = updateBookId();
                        } else if (choice == 4) {
                            num = updateBookAvailabilityStatus();
                        } else if (choice == 5) {
                            num = updateBookGenre();
                        }
                    }
                } else if (num == 3) {
                    Loan.displayLoan();
                }else {
                    return;
                }
            } else {
                do {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Invalid Number try again");
                            System.out.println("1. Add Book");
                            System.out.println("2. Update Book Details");
                            System.out.println("3. View Status of Book Loans");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            num = sc.nextInt();
                            validInput = true;
                        }catch (Exception e){
                            System.out.println("Please try again and enter just numbers");
                            sc.nextLine();
                        }
                    }
                    if (num == 0) {
                        break;
                    }
                    if (num == 1) {
                        num = addBook();
                    } else if (num == 2) {
                        validInput = false;
                        while (!validInput) {
                            try {
                                System.out.println("1. Update Book Title");
                                System.out.println("2. Update Book Author");
                                System.out.println("3. Update Book Id");
                                System.out.println("4. Update Book Availability Status");
                                System.out.println("5. Update Book Genre");
                                System.out.print("Enter your choice: ");
                                System.out.println("0. Exit");
                                choice = sc.nextInt();
                                validInput = true;
                            }catch (Exception e){
                                System.out.println("Please try again and enter just numbers");
                                sc.nextLine();
                            }
                        }
                        if (choice == 1) {
                            num = updateTitleBook();
                        } else if (choice == 2) {
                            num = updateAuthorBook();
                        } else if (choice == 3) {
                            num = updateBookId();
                        } else if (choice == 4) {
                            num = updateBookAvailabilityStatus();
                        } else if (choice == 5) {
                            num = updateBookGenre();
                        } else {
                            do {
                                validInput = false;
                                while (!validInput) {
                                    try {
                                        System.out.println("Invalid Number try again");
                                        System.out.println("1. Update Book Title");
                                        System.out.println("2. Update Book Author");
                                        System.out.println("3. Update Book Id");
                                        System.out.println("4. Update Book Availability Status");
                                        System.out.println("5. Update Book Genre");
                                        System.out.println("0. Exit");
                                        System.out.print("Enter your choice: ");
                                        choice = sc.nextInt();
                                        validInput = true;
                                    }catch (Exception e){
                                        System.out.println("Please try again and enter just numbers");
                                        sc.nextLine();
                                    }
                                }
                                if (choice == 0) {
                                    break;
                                }
                            } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
                            if (choice == 1) {
                                num = updateTitleBook();
                            } else if (choice == 2) {
                                num = updateAuthorBook();
                            } else if (choice == 3) {
                                num = updateBookId();
                            } else if (choice == 4) {
                                num = updateBookAvailabilityStatus();
                            } else if (choice == 5) {
                                num = updateBookGenre();
                            }
                        }
                    } else if (num == 3) {
                        Loan.displayLoan();
                    }
                } while (num != 0);
            }
        } while (num != 0);
    }
}