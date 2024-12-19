package enumerators;

public class Program {

    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", "J. K. Rowling", Type.PHANTASY);
        System.out.printf("enumerators.Book '%s' has a type %s", b1.name, b1.bookType);

        switch (b1.bookType) {
            case BELLETRE:
                System.out.println("Belletre");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
        }

        switch (b1.bookType) {
            case BELLETRE -> System.out.println("Belletre");
            case SCIENCE -> System.out.println("Science");
            case SCIENCE_FICTION -> System.out.println("Science fiction");
            case PHANTASY -> System.out.println("Phantasy");
        }

        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }

        System.out.println(Type.BELLETRE.ordinal());    // 1


        System.out.println(Color.RED.getCode());        // #FF0000
        System.out.println(Color.GREEN.getCode());      // #00FF00
        System.out.println(Color.GREEN.getS());      // #00FF00

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24
    }
}

