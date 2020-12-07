public class AssociateProf extends AssistantProf {
    AssociateProf(int yrs, String name) {
        super(yrs, name);
    }

    public String introduce() {
        return "I am " + super.getname() + ", an Associate Professor. " + super.teaching() + " " + super.research()
                + " " + this.headResearchGroup();
    }

    public String headResearchGroup() {
        return "I am Heading a Research Group.";
    }
}
