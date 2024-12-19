package generics.interface_g;

public class Program {

    public static void main(String[] args) {

        Accountable<String> acc1 = new Account("1235", 10000);
        Account acc2 = new Account("5432", 700);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());


        AccountV2<String> accv2 = new AccountV2<String>("123abc", 5000);
        AccountV2<String> accv3 = new AccountV2<String>("1234", 4300);
        System.out.println(accv2.getId());
        System.out.println(accv3.getId());
    }
}

interface Accountable<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}

class Account implements Accountable<String> {

    private String id;
    private int sum;

    Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

class AccountV2<T> implements Accountable<T> {

    private T id;
    private int sum;

    AccountV2(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}