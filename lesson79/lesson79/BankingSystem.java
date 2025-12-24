package lesson79;

class BankingSystem {

	public static void main(String[] args)  {
		BankAccount account = new BankAccount();
		account.deposit(50000);
		try {
			account.withdraw(10000);
		} catch (ZandakaBusokuException e) {
			System.out.println(e.getMessage());
		} finally{
			System.out.println("取引ありがとうございました");
		}
		



	}
}
