package lesson79;

class BankAccount {

	private String accountHolder;
	private int balance;
	
	public BankAccount(String accountHolder, int balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
		System.out.println(accountHolder + "様の口座を開設しました。"
				+ "初期残高: " + balance);
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "入金");
		System.out.println("残高: " + balance);
	}
	
	void withdraw(int amount) throws ZandakaBusokuException {
		if (amount > balance) {
			// 残高不足の場合、独自例外をスロー
			throw new ZandakaBusokuException("残高不足です");
		}
		balance -= amount;
		System.out.println(amount + "出金");
		System.out.println("残高: " + balance);
	}
}
