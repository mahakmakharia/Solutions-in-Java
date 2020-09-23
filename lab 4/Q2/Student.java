public class Student extends Person {
    public String hobby;

    Student() {
        this.hobby = "Facebook";
    }

    Student(String name) {
        super(name);
        this.hobby = "Facebook";
    }

    public String introduce() {
        return "Hello, my name is " + this.getName() + ",I am a CSE student at IEM and my hobby is using " + this.hobby;
    }
}
