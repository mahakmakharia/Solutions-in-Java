public class AssistantProf {
    private int yearsOfExperience;
    private String name = "";

    AssistantProf(int yrs, String name) {
        this.yearsOfExperience = yrs;
        this.name = name;
    }

    public String teaching() {
        return "I am Teaching. ";
    }

    public String research() {
        return "I am doing Research. ";
    }

    public String getname() {
        return this.name;
    }

    public String introduce() {
        return "I am " + this.name + ", an Assistant Professor. " + this.teaching() + " " + this.research();
    }
}
