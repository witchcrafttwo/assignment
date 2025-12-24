package lesson79;

// Exceptionクラスを継承した、検査例外とすること。
class ZandakaBusokuException extends Exception {

	// エラーメッセージ（String message）を受け取るコンストラクタを作成し、super(message); を実行するようにしておくこと。
	public ZandakaBusokuException(String message) {
		super(message);
	}

	// デフォルトコンストラクタを明示的に作成しておくこと。
}
