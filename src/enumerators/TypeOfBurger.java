package enumerators;

public enum TypeOfBurger {
    SOLO("Solo burger"),
    DOUBLE("Double burger"),
    CHEESE("Cheese burger");

    private final String displayType;

    TypeOfBurger(String displayName){
        this.displayType = displayName;
    }
}
