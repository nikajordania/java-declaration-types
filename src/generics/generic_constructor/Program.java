package generics.generic_constructor;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account("cid123", 5000);
        Account acc2 = new Account(12345, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

class Account {
    private String id;
    private int sum;

    <T> Account(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
