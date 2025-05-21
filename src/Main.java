import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LibrarianInterface librarianInterface = new LibrarianInterface();
        MemberInterface memberInterface = new MemberInterface();
        Scanner scanner = new Scanner(System.in);
       Catalog.addNewBook("1234", "basel" , "ahmed" ,Genre.Fantasy , AvailabilityStatus.available);
       Catalog.addNewBook("1235" , "prog" , "mahmoud" , Genre.ScienceFiction , AvailabilityStatus.available);
        Catalog.addNewBook("12358" , "ahmed" , "mahmoud" , Genre.ScienceFiction , AvailabilityStatus.available);
        Member Ahmed = new Member("111" , "zhmed" , "+201186351478" );
        Member Mahmoud = new Member("222","Aahmoud","mahmoud@gmail.com");
        Member Momen = new Member("333" , "Momen" , "momen@yahoo.com");
        Loan.loanBorrowBook("123",Momen,"12358");
        int choice = -1 , num = -1;
        boolean validInput ;
        do {
            validInput = false;
        while (!validInput) {
            try {
                System.out.println("SIGN IN AS:");
                System.out.println("1. LIBRARIAN\n2. MEMBER\n0. Exit");
                System.out.print("Chose number: ");
                choice = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Please try again and enter just numbers");
                scanner.nextLine();
            }
        }

            if (choice == 1 || choice == 2 || choice == 0) {
                if (choice == 1) {
                    librarianInterface.LibraryManagementMenu();
                } else if (choice == 2) {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("1. Ahmed\n2. Mahmoud\n3. Momen\n0. Exit");
                            System.out.print("YOU ARE: ");
                            num = scanner.nextInt();
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Please try again and enter just numbers");
                            scanner.nextLine();
                        }
                    }
                    if (num == 1 || num == 2 || num == 3 || num == 0) {
                        if (num == 1) {
                            memberInterface.MemberInterfaceMenu(Ahmed);
                        } else if (num == 2) {
                            memberInterface.MemberInterfaceMenu(Mahmoud);
                        } else if (num == 3) {
                            memberInterface.MemberInterfaceMenu(Momen);
                        } else {
                            System.out.println("SYSTEM CLOSED !!");
                            return;
                        }
                    } else {
                        do {
                            validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.println("Invalid Number try again");
                                    System.out.println("1. Ahmed\n2. Mahmoud\n3. Momen\n0. Exit");
                                    System.out.print("YOU ARE: ");
                                    num = scanner.nextInt();
                                    validInput = true;
                                } catch (Exception e) {
                                    System.out.println("Please try again and enter just numbers");
                                    scanner.nextLine();
                                }
                            }
                        } while (num != 1 && num != 2 && num != 3 && num != 0);
                        if (num == 1 || num == 2 || num == 3 || num == 0) {
                            if (num == 1) {
                                memberInterface.MemberInterfaceMenu(Ahmed);
                            } else if (num == 2) {
                                memberInterface.MemberInterfaceMenu(Mahmoud);
                            } else if (num == 3) {
                                memberInterface.MemberInterfaceMenu(Momen);
                            } else {
                                System.out.println("SYSTEM CLOSED !!");
                                return;
                            }
                        }
                    }
                }
            } else {
                do {
                    validInput = false;
                    System.out.println("Invalid Number try again");
                    while (!validInput) {
                        try {
                            System.out.println("SIGN IN AS:");
                            System.out.println("1. LIBRARIAN\n2. MEMBER\n0. Exit");
                            System.out.print("Chose number: ");
                            choice = scanner.nextInt();
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Please try again and enter just numbers");
                            scanner.nextLine();
                        }
                    }
                }while (choice != 1 && choice != 2 && choice != 0);
                if (choice == 1){
                    librarianInterface.LibraryManagementMenu();
                } else if (choice == 2) {
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("1. Ahmed\n2. Mahmoud\n3. Momen\n0. Exit");
                            System.out.print("YOU ARE: ");
                            num = scanner.nextInt();
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Please try again and enter just numbers");
                            scanner.nextLine();
                        }
                    }
                    if (num == 1 || num == 2 || num == 3 || num == 0){
                        if (num == 1){
                            memberInterface.MemberInterfaceMenu(Ahmed);
                        } else if (num == 2) {
                            memberInterface.MemberInterfaceMenu(Mahmoud);
                        }else {
                            System.out.println("SYSTEM CLOSED !!");
                            return;
                        }
                    }else {
                        do {
                            validInput = false;
                            while (!validInput) {
                                try {
                                    System.out.println("Invalid Number try again");
                                    System.out.println("1. Ahmed\n2. Mahmoud\n3. Momen\n0. Exit");
                                    System.out.print("YOU ARE: ");
                                    num = scanner.nextInt();
                                    validInput = true;
                                } catch (Exception e) {
                                    System.out.println("Please try again and enter just numbers");
                                    scanner.nextLine();
                                }
                            }
                        }while (num != 1 && num != 2 && num != 3 && num != 0);
                        if (num == 1){
                            memberInterface.MemberInterfaceMenu(Ahmed);
                        } else if (num == 2) {
                            memberInterface.MemberInterfaceMenu(Mahmoud);
                        }else {
                            System.out.println("SYSTEM CLOSED !!");
                            return;
                        }
                    }
                }
            }
        }while (choice != 0);
        System.out.println("SYSTEM CLOSED !!");
    }
}