package Week4.ClassProblems;

public class FeeAccount {
    public void pay(double amount) {
        System.out.println("Paid in one go (day-scholar account)");
    }

    public static void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            HostelFeeAccount hostelAccount = (HostelFeeAccount) account;
            hostelAccount.payHostelFee(amount);
        } else {
            account.pay(amount);
        }
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };
        
        int hostelCount = 0;
        int dayScholarCount = 0;

        for (FeeAccount acc : accounts) {
            processPayment(acc, 60000);
            
            if (acc instanceof HostelFeeAccount) {
                hostelCount++;
            } else {
                dayScholarCount++;
            }
        }
        
        System.out.println("Hostel accounts processed: " + hostelCount + " | Day-scholar accounts processed: " + dayScholarCount);
    }
}

// Subclass
class HostelFeeAccount extends FeeAccount {
    public void payHostelFee(double amount) {
        System.out.println("Paid in two installments (hostel account)");
    }
}