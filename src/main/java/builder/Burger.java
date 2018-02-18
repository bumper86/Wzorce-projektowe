package builder;

public class Burger {
    private int size;
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean lettuce = false;
    private boolean tomato = false;

    public Burger(BurgeBuilder burgeBuilder) {
        this.size = burgeBuilder.size;
        this.cheese = burgeBuilder.cheese;
        this.pepperoni = burgeBuilder.pepperoni;
        this.lettuce = burgeBuilder.lettuce;
        this.tomato = burgeBuilder.tomato;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }
}
