package generics;

public class GenericClass {

    public static void main(String[] args) {

        GenericClassAccount<String> acc1 = new GenericClassAccount<String>("5678", 1000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        GenericClassAccount<Integer> acc2 = new GenericClassAccount<Integer>(5678, 1000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}

class GenericClassAccount<T> {

    private T id;
    private int sum;

    GenericClassAccount(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}