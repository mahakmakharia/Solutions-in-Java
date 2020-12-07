public class ExecutiveOfficer extends SeniorOfficer {
    public ExecutiveOfficer(double limit) {
        super(limit);
    }

    public boolean approveWithdrawl(double cash) {
        if (cash <= super.approvalLimit)
            return true;
        else
            return false;
    }
}