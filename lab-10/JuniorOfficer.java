public class JuniorOfficer {
    public double approvalLimit = 0;

    public JuniorOfficer(double limit) {
        approvalLimit = limit;
    }

    public boolean approveAccountCreation() {
        System.out.println("Your account creation is approved");
        return true;
    }

    public boolean approveWithdrawl(double cash) {
        if (cash <= this.approvalLimit)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        JuniorOfficer myJnr = new JuniorOfficer(10000);
        if (myJnr.approveAccountCreation()) {
            System.out.println("Approved by Junior officer");
        }
        if (myJnr.approveWithdrawl(9999)) {
            System.out.println("Withdrawl  Approved by Junior officer");
        } else {
            System.out.println("Sorry withdrawl cannot be Approved by Junior officer");
        }
        SeniorOfficer mySnr = new SeniorOfficer(50000);
        if (mySnr.approveAccountCreation()) {
            System.out.println("Approved by Senior officer");
        }
        if (mySnr.approveWithdrawl(50000)) {
            System.out.println("Withdrawl Approved by Senior officer");
        } else {
            System.out.println("Sorry withdrawl cannot be Approved by Senior officer");
        }
        ExecutiveOfficer myExv = new ExecutiveOfficer(100000);
        if (myExv.approveAccountCreation()) {
            System.out.println("Approved by Executive officer");
        }
        if (myExv.approveWithdrawl(10005)) {
            System.out.println(" Withdrawl Approved by Executive officer");
        }
    }
}
