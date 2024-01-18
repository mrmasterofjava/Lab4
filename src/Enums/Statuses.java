package Enums;

public enum Statuses {
    UNDERSTAND("понимающий"),
    NOUNDERSTAND("не понимающий"),
    TRIED("уставший"),
    FUNNY("веселый"),
    NORMAL("нормальный"),
    ANGRY("рассерженный"),
    THREATENING("грозящий"),
    FRIENDLY("приветлево"),
    WIDELY("широко"),
    PRETTY("хорошенькое");

    private final String title;
    Statuses(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}
