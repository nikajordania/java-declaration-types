package records;

import model.Person;

public class ProgramRecordExample {

    public static void main(String[] args) {

        Person tom1 = new Person("Tom1", 36);
        System.out.println(tom1.toString());


        PersonRecord tom = new PersonRecord("Tom", 36);

        System.out.println(tom.name());     // Tom
        System.out.println(tom.age());      // 36
        System.out.println(tom.hashCode());

        PersonRecord bob = new PersonRecord("Bob", 21);
        PersonRecord tomas = new PersonRecord("Tom", 36);
        System.out.println(tom.equals(bob));    // false
        System.out.println(tom.equals(tomas));  // true
    }
}

