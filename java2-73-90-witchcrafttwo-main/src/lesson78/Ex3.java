package lesson78;

// 独自例外クラスの定義①

import java.security.MessageDigest;

class DataAccessException extends Exception {
	// データアクセスに関する一般的な例外
	DataAccessException() {

	}
	DataAccessException(String message) {
		super(message);
	}
}

// 独自例外クラスの定義②
class FileDataAccessException extends DataAccessException {
	// ファイルデータアクセスに関する例外
	
	
	
	
	
	
}

// スーパークラス
class DataProcessor {
	// このメソッドはDataAccessExceptionをスローする可能性がある
	public void process() throws DataAccessException {
		System.out.println("データ処理を実行します。");
		throw new DataAccessException("データ処理エラー");
	}
}

// サブクラス
class FileDataProcessor extends DataProcessor {
	// processメソッドをオーバーライドする
	public void process() throws DataAccessException {
		System.out.println("ファイルデータ処理を実行します。");
		throw new FileDataAccessException();
	}
	
	
	
	
	
	
}


public class Ex3 {
	public static void main(String[] args) {
		DataProcessor processor = new FileDataProcessor();
		
		try {
			processor.process();
		} catch (DataAccessException e) {
		}
		
		

	}

}
