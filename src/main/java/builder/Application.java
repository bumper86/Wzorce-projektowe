package builder;

public class Application {
    public static void main(String[] args) {
        Burger burger = new BurgeBuilder(10)
                .addCheese()
                .addTomato()
                .build();

        System.out.println(burger);
    }
}
