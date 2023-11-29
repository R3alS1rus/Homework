package src.on_lesson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionProcessor {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("Война и мир", "Толстой", Genre.FICTION, BookStatus.AVAILABLE, LocalDate.of(1800, 02,28), 1000 ));
        libraryItems.add(new Book("Преступление и наказание", "Достоевский", Genre.HISTORY, BookStatus.LOST, LocalDate.of(1866, 12,1), 500 ));
        libraryItems.add(new Book("Собачье сердце", "Булгаков", Genre.FICTION, BookStatus.BORROWED, LocalDate.of(1925, 10,6), 700 ));

        libraryItems.add(new Magazine("Лучший товарищ", "Петерсон", Genre.FANTASY, 25, LocalDate.of(2022, 6, 21), true));

        printAllItems(libraryItems);
        System.out.println();
        listItemsByGenre(libraryItems, Genre.FICTION);
    }

    static void printInfo(LibraryItem item){
        System.out.print(item + " ");
        System.out.print(item.getTitle() + " ");
        System.out.print(item.getAuthor() + " ");
        System.out.println(item.getGenre() + " ");
    }
    static void printAllItems(List<LibraryItem> items){
        for (LibraryItem item : items) {
            printInfo(item);
        }
    }
    static void listItemsByGenre(List<LibraryItem> items, Genre genre){
        for (LibraryItem item : items){
            if (item.getGenre().equals(genre)){
                printInfo(item);
            }
        }
    }
    void sortByTitle(List<LibraryItem> items){
            Collections.sort(items, Comparator.comparing(LibraryItem::getTitle));
            for (LibraryItem item : items) {
                printInfo(item);
        }
    }
    void filterByAuthor(List<LibraryItem> items, String author){}
    void countItemsByStatus(List<LibraryItem> items, BookStatus status){}
    void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus){}
    void listAvailableItems(List<LibraryItem> items){}
    void findOldestItem(List<LibraryItem> items){}
    void groupItemsByAuthor(List<LibraryItem> items){}
    void listItemsForRepair(List<LibraryItem> items){}
    void displayItemCount(List<LibraryItem> items){}
    void listBorrowedItemsByUser(List<LibraryItem> items, User user){}
    void removeLostItems(List<LibraryItem> items){}
    void addItemToList(List<LibraryItem> items, LibraryItem item){}
    void removeItemFromList(List<LibraryItem> items, LibraryItem item){}
    void sortItemsByPublicationDate(List<LibraryItem> items){}
    void findMostPopularGenre(List<LibraryItem> items){}
    void calculateAveragePageCount(List<Book> books){}
    void listMonthlyMagazines(List<Magazine> magazines){}
    void listItemsByCondition(List<LibraryItem> items, ItemCondition condition){}
}
