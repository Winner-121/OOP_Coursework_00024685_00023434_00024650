package enumerators;

public enum MeatInBurger {
    BEEF("Beef Burger"),
    CHICKEN("Chicken Burger"),
    VEGGIE("Veggie Burger"),
    FISH("Fish Burger");

    private final String displayMeat;

    MeatInBurger(String displayName) {
        this.displayMeat = displayName;
    }
}
