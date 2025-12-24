package lesson77;

class SampleCase {
	
	static int balance = 10000; // 残高
	static int stock = 5;       // 在庫数

	public static void main(String[] args) {
		
		// 各メソッドを呼び出して例外処理を実装してください
		
		withdraw(15000);

		reduceStock(10);
		
		inputAge(-5);
		
		
	}
	
	
	// 出金するメソッド
	static void withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("残高不足です");
		}
	}
	
	// 在庫を減らすメソッド
	static void reduceStock(int amount) throws Exception {
		if (stock < amount) {
			throw new Exception("在庫不足です");
		}
	}
	
	// 年齢入力メソッド
	static void inputAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("年齢が不正です");
		}
	}

}
