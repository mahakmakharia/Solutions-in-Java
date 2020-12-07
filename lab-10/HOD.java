public class HOD extends AssociateProf {
    HOD(int yrs, String name) {
        super(yrs, name);
        // this.yearsOfExperience=yrs;
        // this.name=name;
    }

    public String introduce() {
        return "I am " + super.getname() + ", the HOD. " + super.teaching() + " " + super.research() + " "
                + super.headResearchGroup() + " " + this.manageDept();
    }

    public String manageDept() {
        return "I manage the Department.";
    }
}