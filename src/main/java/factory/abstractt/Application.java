package factory.abstractt;

public class Application {

    public static void main(String[] args) {
        WoodenDoorFactory door = new WoodenDoorFactory();
        WoodenDoorFactory exper = new WoodenDoorFactory();
        door.makeDoor().getDescription();
        exper.makeFittingExpert().getDescription();

        IronDoorFactory doorTwo = new IronDoorFactory();
        IronDoorFactory expertTwo = new IronDoorFactory();
        doorTwo.makeDoor().getDescription();
        expertTwo.makeFittingExpert().getDescription();

    }
}
