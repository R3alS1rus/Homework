package src.on_lesson;

import java.util.List;

public class Librarian implements Maintainable{
    private String name;
    private String employeeId;
    private List<LibraryItem> managedItems;

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
