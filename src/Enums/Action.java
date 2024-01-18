package Enums;

public enum Action {
    ACTION_OF_THING("действие штуковины"),
    START_EXPLAINING("начало объяснения");
    private final String title;
    Action(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}