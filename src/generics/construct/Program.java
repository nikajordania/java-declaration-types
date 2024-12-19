package generics.construct;

public class Program {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
//        printer.print(people);
//        printer.print(numbers);

        printer.print(people, String.class);
        printer.print(numbers, Integer.class);
    }
}

class Printer {
    public <T, S> S print(T[] items, S s) {
        for (T item : items) {
            System.out.println(item);
        }
        return (S) s;
    }

//    public void print(String[] items) {
//        for (String item : items) {
//            System.out.println(item);
//        }
//    }
//
//    public void print(Integer[] items ) {
//        for (Integer item : items) {
//            System.out.println(item);
//        }
//    }
}