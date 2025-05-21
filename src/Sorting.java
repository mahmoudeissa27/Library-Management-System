import java.util.ArrayList;

public class  Sorting {





    static LinkedListStack mergeSortByTitleF(LinkedListStack linkedListStack) {
        if (linkedListStack.isEmpty()) {
            return linkedListStack;
        }

        // نقل الكتب من المكدس إلى مصفوفة
        Book[] books = new Book[linkedListStack.size()];
        for (int i = 0; i < books.length; i++) {
            books[i] = linkedListStack.pop();
        }

        // تنفيذ الترتيب باستخدام mergeSort
        books = mergeSort(books);

        // إعادة الكتب إلى المكدس بالترتيب
        for (int i = books.length - 1; i >= 0; i--) {
            linkedListStack.push(books[i]);
        }

        return linkedListStack;
    }

    public static Book[] mergeSort(Book[] books) {
        if (books.length < 2) {
            return books; // إذا كان الحجم أقل من 2، لا حاجة للترتيب
        }

        int mid = books.length / 2;

        // تقسيم المصفوفة إلى جزئين
        Book[] left = new Book[mid];
        Book[] right = new Book[books.length - mid];

        System.arraycopy(books, 0, left, 0, mid);
        System.arraycopy(books, mid, right, 0, books.length - mid);

        // ترتيب الجزئين بشكل منفصل
        left = mergeSort(left);
        right = mergeSort(right);

        // دمج الجزئين المرتبين
        return mergeSortByTitleS(left, right);
    }

    private static Book[] mergeSortByTitleS(Book[] left, Book[] right) {
        Book[] sortedBooks = new Book[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // دمج الجزئين حسب العنوان
        while (i < left.length && j < right.length) {
            if (left[i].getTitle().compareTo(right[j].getTitle()) <= 0) {
                sortedBooks[k++] = left[i++];
            } else {
                sortedBooks[k++] = right[j++];
            }
        }

        // نسخ العناصر المتبقية من الجزئين
        while (i < left.length) {
            sortedBooks[k++] = left[i++];
        }

        while (j < right.length) {
            sortedBooks[k++] = right[j++];
        }

        return sortedBooks;
    }


    // دالة لفرز ArrayList باستخدام MergeSort
    public static void mergeSort(ArrayList<Member> members) {
        if (members.size() < 2) {
            return; // إذا كانت القائمة تحتوي على عنصر واحد أو أقل، لا حاجة للفرز
        }

        int mid = members.size() / 2;

        // تقسيم القائمة إلى جزئين
        ArrayList<Member> left = new ArrayList<>(members.subList(0, mid));
        ArrayList<Member> right = new ArrayList<>(members.subList(mid, members.size()));

        // فرز الجزئين بشكل منفصل
        mergeSort(left);
        mergeSort(right);

        // دمج الجزئين المرتبين
        mergem(members, left, right);
    }

    // دالة دمج الجزئين المرتبين
    private static void mergem(ArrayList<Member> members, ArrayList<Member> left, ArrayList<Member> right) {
        int i = 0, j = 0, k = 0;

        // دمج العناصر بناءً على المقارنة بين أسماء الأعضاء
        while (i < left.size() && j < right.size()) {
            if (compareNames(left.get(i).getName(), right.get(j).getName()) <= 0) {
                members.set(k++, left.get(i++));
            } else {
                members.set(k++, right.get(j++));
            }
        }

        // نسخ العناصر المتبقية من الجزء الأيسر
        while (i < left.size()) {
            members.set(k++, left.get(i++));
        }

        // نسخ العناصر المتبقية من الجزء الأيمن
        while (j < right.size()) {
            members.set(k++, right.get(j++));
        }
    }

    // دالة مقارنة للتعامل مع الأسماء الفارغة
    private static int compareNames(String name1, String name2) {
        if (name1 == null && name2 == null) {
            return 0;
        } else if (name1 == null) {
            return 1; // ضع الأسماء الفارغة في النهاية
        } else if (name2 == null) {
            return -1;
        }
        return name1.compareToIgnoreCase(name2);
    }



    public static void mergeSort1(ArrayList<Loan> loans) {
        if (loans.size() < 2) {
            return; // إذا كانت القائمة تحتوي على عنصر واحد أو أقل، لا حاجة للفرز
        }

        int mid = loans.size() / 2;

        // تقسيم القائمة إلى جزئين
        ArrayList<Loan> left = new ArrayList<>(loans.subList(0, mid));
        ArrayList<Loan> right = new ArrayList<>(loans.subList(mid, loans.size()));

        // فرز الجزئين بشكل منفصل
        mergeSort1(left);
        mergeSort1(right);

        // دمج الجزئين المرتبين
        merge(loans, left, right);
    }

    // دالة دمج الجزئين المرتبين
    private static void merge(ArrayList<Loan> loans, ArrayList<Loan> left, ArrayList<Loan> right) {
        int i = 0, j = 0, k = 0;

        // دمج العناصر بناءً على مقارنة تاريخ الاستحقاق
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getIssueDate().compareTo(right.get(j).getIssueDate()) <= 0) {
                loans.set(k++, left.get(i++));
            } else {
                loans.set(k++, right.get(j++));
            }
        }

        // نسخ العناصر المتبقية من الجزء الأيسر
        while (i < left.size()) {
            loans.set(k++, left.get(i++));
        }

        // نسخ العناصر المتبقية من الجزء الأيمن
        while (j < right.size()) {
            loans.set(k++, right.get(j++));
        }
    }
}

