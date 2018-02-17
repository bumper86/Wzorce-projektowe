package factory.simple;

public final class DoorFactory {
    public static final String WOODEN = "WOODEN";

    public final Door makeDoor(final String doorClass) {
        switch (doorClass) {
            case WOODEN:
                return new WoodenDoor(189, 1408);
                default:
                    return null;
        }
    }

    /*  lub takie cos

     public final Door makeDoor(final float weight, final float height) {
                return new WoodenDoor(weight, height);
    } */
}
