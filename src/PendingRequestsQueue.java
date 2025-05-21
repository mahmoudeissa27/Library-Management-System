public class PendingRequestsQueue {
    static LinkedListQueue linkedListQueue = new LinkedListQueue();
    public static boolean addPendingRequest(Book book){
        if (book.getAvailabilityStatus() == AvailabilityStatus.notAvailable){
            linkedListQueue.enqueue(book);
            return true;
        }
        return false;
    }
    public boolean removePendingRequest(Book book){
        if (book.getAvailabilityStatus() == AvailabilityStatus.available){
            System.out.println(linkedListQueue.dequeue());
            return true;
        }
        return false;
    }
    public void showPendingRequestsList(){
        if (!linkedListQueue.isEmpty()){
            linkedListQueue.printQueue();
        }else {
            System.out.println("Pending Requests List is empty");
        }
    }
}
