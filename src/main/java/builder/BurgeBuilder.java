package builder;

public class BurgeBuilder {
    int size;
    boolean cheese = false;
    boolean pepperoni = false;
    boolean lettuce = false;
    boolean tomato = false;

    public BurgeBuilder(int size) {
        this.size = size;
    }

    public BurgeBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public BurgeBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public BurgeBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public BurgeBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public Burger build() {
        return new Burger(this);
    }
}
