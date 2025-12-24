package lesson79;

class EventRegister {
	public static void main(String[] args) {
		EventManager manager = new EventManager();

		// Alice (25歳) - 正常登録
		System.out.println("--- Aliceさん(25歳)の登録処理 ---");
		try {
			manager.register("Alice", 25);
			
		} catch (AgeException e) {
			System.err.println("登録エラー: " + e.getMessage());
		} catch (CapaException e) {
			System.err.println("登録エラー: " + e.getMessage());
		}
		
		// Bob (17歳) - 年齢エラー
		System.out.println("\n--- Bobさん(17歳)の登録処理 ---");
		try {
			manager.register("Bob", 17);
			
		} catch (AgeException e) {
			System.err.println("登録エラー: " + e.getMessage());
		} catch (CapaException e) {
			System.err.println("登録エラー: " + e.getMessage());
		}

		// Eve (28歳) - 定員オーバーエラー
		System.out.println("\n--- Eveさん(28歳)の登録処理 ---");
		try {
			manager.register("Eve", 28);
			
		} catch (AgeException e) {
			System.err.println("登録エラー: " + e.getMessage());
		} catch (CapaException e) {
			System.err.println("登録エラー: " + e.getMessage());
		}

	}

}

class EventManager {
	private static final int MAX_CAPACITY = 1; // 定員1名
	private int currentCount = 0;

	public void register(String name, int age) throws AgeException, CapaException {
		// 年齢チェック
		if (age < 18 || age > 29) {
			throw new AgeException("参加可能年齢(18〜29歳)の範囲外です。");
		}

		// 定員チェック
		if (currentCount >= MAX_CAPACITY) {
			throw new CapaException("申し訳ありませんが、満席です。");
		}

		currentCount++;
		System.out.println(name + "さんの参加登録を受け付けました。 (現在: " + currentCount + "名)");
	}
}

//年齢エラーの独自例外
class AgeException extends Exception {
	public AgeException() {
		super();
	}
	
	public AgeException(String message) {
		super(message);
	}
}

//定員オーバーエラーの独自例外
class CapaException extends Exception {
	public CapaException() {
		super();
	}
	
	public CapaException(String message) {
		super(message);
	}
}