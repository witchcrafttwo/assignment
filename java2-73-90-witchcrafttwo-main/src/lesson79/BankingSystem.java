package lesson79;

class BankingSystem {

	public static void main(String[] args) throws SubZandakaBusoku {
		BankAccount account = new BankAccount("田中太郎", 5000);
		
		
		try {
			account.deposit(2000);
			account.withdraw(10000);
		} catch (ZandakaBusokuException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("取引ありがとうございました。");
		}
		
		throw new SubZandakaBusoku();
	}

}
