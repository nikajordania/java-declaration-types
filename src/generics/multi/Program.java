package generics.multi;


public class Program {

    public static void main(String[] args) {

        Account<String, Double> acc1 = new Account<String, Double>("123", 3000.99);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);
    }
}

class Account<T, S> {

    private T id;
    private S sum;

    Account(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}