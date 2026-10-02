package enumerators;

public enum SizeOfBurger {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L");

    private final String displaySize;

    SizeOfBurger(String displaySize){
        this.displaySize = displaySize;
    }
}
