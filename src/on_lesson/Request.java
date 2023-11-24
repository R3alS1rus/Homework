package src.on_lesson;

public class Request {
    private String message;
    private int number;

    public Request(String message, int number) {
        this.message = message;
        this.number = number;

    }

    public int getNumber() {
        return number;
    }
    public String getMessage() {
        return message;
    }
}
