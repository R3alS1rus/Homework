package src.on_lesson;

public interface Maintainable {
    void repairItem();
    void updateItemCondition(ItemCondition condition);
    ItemCondition checkCondition();

}
