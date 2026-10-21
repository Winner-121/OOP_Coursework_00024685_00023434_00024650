package enumerators;

public enum CrepesTypes {
    NUTTELA("Nutella & Banana", 500),
    STRAWBERRY("Strawberry & Cream", 550),
    CHOCOLATE("Chocolate & Cream", 550),
    APPLE("Apple & Cinnamon", 450),
    CLASSIC("Classic", 300);

    private final String displayType;
    private final String base;
    private final Integer priceInCents;

    CrepesTypes(String displayType,Integer priceInCents) {
        this.displayType = displayType;
        this.base = "Classic";
        this.priceInCents = priceInCents;
    }

    public String getDisplayType() {
        return displayType;
    }

    public String getBase() {
        return base;
    }

    public Integer getPriceInCents() {
        return priceInCents;
    }
}
