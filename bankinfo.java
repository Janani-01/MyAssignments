package week4.day1;

public class BankInfo {
	public void saving() {
		System.out.println("70000");
	}
	public void fixed() {
		System.out.println("40900");
	}
	public void deposit() {
		System.out.println("150000");
	}
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();
	}
	

}