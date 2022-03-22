package lab4;

 class Account {
	private long accNum;
	private double balance;
	private Account accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Account getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Account accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double i) {
		this.balance=this.balance+i;
		
	}
	public void withdraw(double i) {
		if(i<=this.balance-500) {
			this.balance=this.balance-i;
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}
	public double getBalance() {
		return this.balance;
	}

}
class Savings_Account extends Account{
	final double minimum_bal=200;
	@Override
	public void withdraw(double i) {
		Account bal=new Account();
		if(bal.getBalance()>200) {
			super.withdraw(i);
		}
		else {
			System.out.println("In sufficient funds");
		}
		
	}
	
	
}
class Current_Account extends Account{
	double overdraft_limit;
	@Override
	public void withdraw(double i) {
		
	}
}

public class Human{
	private String name;
	private float age;
	public static void main(String[] args) {
		Account smith=new Account();
		smith.deposit(2000);
		smith.setAccHolder(smith);
		smith.setAccNum(12345);
		
		Account kathy=new Account();
		kathy.deposit(3000);
		kathy.setAccHolder(kathy);
		kathy.setAccNum(56789);
		
		smith.deposit(2000);
	
		kathy.withdraw(2000);
		System.out.println(smith.getBalance());
		System.out.println(kathy.getBalance());
		
		
		
	}
	
}
