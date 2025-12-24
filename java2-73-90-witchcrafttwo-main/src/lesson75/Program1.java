package lesson75;

class Program1 {

	public static void main(String[] args) {
		
		hikidashi(15000); // 15000円引き出し
	}
	
	// 引き出しメソッド amount:引き出す金額
	public static void hikidashi(int amount) {
		int zandaka = 10000; // 残高
		
	    if (amount > zandaka) {
	        System.out.println("エラー：残高不足です");
	    }
	    zandaka -= amount;  // 😱 実行されてしまう！残高がマイナスに！
	    updateDatabase();   // 😱 間違ったデータが保存される
	    sendEmail();        // 😱 エラーなのにメールが送信される
	}
	
	private static void updateDatabase() {
		// データベース更新処理
	}
	
	private static void sendEmail() {
		// メール送信処理
	}

}
