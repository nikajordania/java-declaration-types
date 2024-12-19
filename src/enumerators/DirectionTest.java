package enumerators;

public class DirectionTest {
    public static void main(String[] args) {
        Direction d = Direction.WEST;
        printDirection(d);


    }

    public static void printDirection(Direction d) {
        if (d == Direction.SOUTH) {
            System.out.println("South");
            System.out.println(d.getTranslate());
        } else if (d == Direction.NORTH) {
            System.out.println("North");
        }
    }
}
