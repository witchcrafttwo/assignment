package lesson76_1;

import java.io.FileReader;

class GameLoader {
	public static void main(String[] args) {
		System.out.println(">>> ロード処理を開始します");
		

	    // 【問題】
		// try - catch - catch - finally 構文を使って完成させてください。
	    // 1. (A)と(B)の箇所で例外処理を書いてください。
	    // 2. (C)の箇所でプログラム成功・失敗に関わらず処理の最後には必ず
		//「>>> メモリを解放しました」と表示する

	    System.out.println(">>> データを検索中...");

	    // (A)チェック例外FileNotFoundExceptionが発生する可能性あり
	    FileReader reader = new FileReader("save.dat "); 

	    
	    
	    System.out.println(">>> データの展開中(3秒待機)...");
	    
	    // (B)チェック例外InterruptedExceptionが発生する可能性あり
	    Thread.sleep(3000); // 3秒待機


	    // (C) 最後に必ず実行する
	    
	    
	    

	    System.out.println(">>> ロード完了！");
	    
	

	}
}
