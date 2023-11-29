package src.on_lesson;

import java.time.LocalDate;

public class Book extends LibraryItem implements Borrowable, Maintainable{
    private BookStatus status;
    private LocalDate publishDate;
    private int pageCount;

    @Override
    public void borrowItem(User user) {

    }

    @Override
    public void returnItem(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void repairItem() {

    }

    @Override
    public void updateItemCondition(ItemCondition condition) {

    }

    @Override
    public ItemCondition checkCondition() {
        return null;
    }
}
