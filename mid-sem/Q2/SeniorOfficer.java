public class SeniorOfficer extends JuniorOfficer {

    String position;
    int amountallowed = 50000;

    SeniorOfficer() {
        this.position = "senior";
    }

    boolean canApprove(int amount) {
        if (amount >= this.amountallowed && amount <= 100000)
            return false;
        else
            return true;
    }

}
