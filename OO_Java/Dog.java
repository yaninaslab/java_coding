public class Dog {
    String breed;
    boolean hasOwner;
    int age;

    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        Dog leo = new Dog("pom", true, 2);
        Dog jessie = new Dog("cockapoo", true, 1);
        boolean isLeoOlder = leo.age > jessie.age;
        int totalDogYears = leo.age + jessie.age;
        System.out.println("Two dogs created: a " + leo.breed + " and a " + jessie.breed);
        System.out.println("The statement that leo is an older dog is: " + isLeoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Main method finished");
    }
}
