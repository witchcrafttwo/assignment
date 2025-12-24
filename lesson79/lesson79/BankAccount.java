package lesson79;

class BankAccount {
	private String accountHolder;
	private int balance;
	
	
	// privateフィールドとして、accountHolder (口座名義人, String) と balance (残高, int) を持つ。
	
	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "入金");
		System.out.println("残高: " + balance);
	}
	
	void withdraw(int amount) throws ZandakaBusokuException {
		if (balance < amount) {
			throw new ZandakaBusokuException("残高不足です。");
			// 残高不足の場合、独自例外をスロー

		}
		balance -= amount;
		System.out.println(amount + "出金");
		System.out.println("残高: " + balance);
	}
}
