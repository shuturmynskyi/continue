package referance;

public class Reference {

    public static void main(String[] args) {
        Person olha = new Person();
        Person inna = new Person();

        olha.name = "Olha";
        olha.age = 10;

        inna.name = "Inna";
        inna.age = 15;

        System.out.println("Olha age is " + olha.age + ", Inna age is " + inna.age);
        swapAge(olha, inna);
        System.out.println("Olha age is " + olha.age + ", Inna age is " + inna.age);

    }

    private static void swapAge(Person olha, Person inna) {
        int tempPerson = olha.age;
        olha.age = inna.age;
        inna.age = tempPerson;
    }

    static class Person {
        String name;
        int age;

    }
}
