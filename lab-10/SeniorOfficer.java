public class SeniorOfficer extends JuniorOfficer {
    public SeniorOfficer(double limit) {
        super(limit);
    }

    public boolean approveWithdrawl(double cash) {
        if (cash <= super.approvalLimit)
            return true;
        else
            return false;
    }
}
