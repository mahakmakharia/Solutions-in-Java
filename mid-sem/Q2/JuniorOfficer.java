public class JuniorOfficer {

    String position;
    int amountallowed = 10000;

    JuniorOfficer() {
        this.position = "junior";
    }

    boolean canApprove(int amount) {
        if (amount > this.amountallowed)
            return false;
        else
            return true;
    }

}
