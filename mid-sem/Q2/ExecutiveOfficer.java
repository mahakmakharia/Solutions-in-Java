public class ExecutiveOfficer extends SeniorOfficer {

    String position;
    int amountallowed = 100000;

    ExecutiveOfficer() {
        this.position = "executive";
    }

    boolean canApprove(int amount) {
        if (amount >= amountallowed)
            return true;
        else
            return false;
    }

}
