public class Person {
    public String hobby;
    private String name;

    Person() {
        this.hobby = "Reading";
    }

    Person(String name) {
        this.name = name;
        this.hobby = "Reading";
    }

    public String getName() {
        return this.name;
    }

    public String introduce() {
        return "Hello, my name is " + this.getName() + " and my hobby is " + this.hobby;
    }

}
