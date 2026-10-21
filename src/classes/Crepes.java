package classes;

import enumerators.CrepesTypes;
import enumerators.SizeOfCrepe;
import enumerators.TypeOfBurger;

public class Crepes {
    private String base;
    private String filling;
    private String fruit;
    private String topping;
    private String size;
    private Integer price; //In cents

    public Crepes(CrepesTypes crepeType, SizeOfCrepe size) {
        this.base = crepeType.getBase();
        this.filling = crepeType.getDisplayType();
        this.size = size.getDisplaySize();
        this.price = crepeType.getPriceInCents();
    }

    public Double getPrice() {
        return price/100.0;
    }
}
