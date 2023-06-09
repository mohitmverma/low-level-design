package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {

    }
}

enum BookFormat {
    HARDCOVER, PAPERBACK, AUDIO_BOOK, EBOOK,
    NEWSPAPER, MAGAZINE, JOURNAL
}

enum BookStatus {
    AVAILABLE, RESERVED,
    LOANED,
    LOST
}

enum ReservationStatus {
    WAITING,
    PENDING,
    CANCELED,
    NONE
}

enum AccountStatus {
    ACTIVE,
    CLOSED,
    CANCELED, BLACKLISTED,
    NONE
}
