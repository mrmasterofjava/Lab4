package Enums;

public enum Attempt {
    LUCKY(" попытка удалась "), UNLUCKY(" попытка не увенчалась успехом ");

    private final String title;
    Attempt(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}
