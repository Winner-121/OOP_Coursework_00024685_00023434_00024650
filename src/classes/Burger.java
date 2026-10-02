package classes;

import enumerators.MeatInBurger;
import enumerators.SizeOfBurger;
import enumerators.TypeOfBurger;

public class Burger {
    MeatInBurger meat;
    TypeOfBurger type;
    SizeOfBurger size;
    Integer price; //In cents

    public MeatInBurger getMeat() {
        return meat;
    }

    public TypeOfBurger getType() {
        return type;
    }

    public SizeOfBurger getSize() {
        return size;
    }

    public Double getPrice() {
        return Double.valueOf(price)/100;
    }
}
