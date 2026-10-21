package enumerators;

public enum SizeOfCrepe {
    S("Small"),
    M("Medium"),
    L("Large");

    private final String displaySize;

    SizeOfCrepe(String displaySize){
        this.displaySize = displaySize;
    }

    public String getDisplaySize() {
        return displaySize;
    }
}
