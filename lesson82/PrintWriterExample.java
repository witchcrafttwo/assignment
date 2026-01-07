package lesson82;

class PrintWriterExample {

	public static void main(String[] args) {
		// ファイル名を変数で定義
		String fileName = "output.txt";

		// try-with-resources文でリソースをまとめて管理
		try (         ) {

		    // printlnメソッドが使える！改行を含む
		    
			
			
			

		} catch (IOException e) {
		    // ファイル操作中にエラーが発生した場合の処理
			System.out.println("ファイル操作中にエラーが発生しました");
		}
		// tryブロックを抜けると、pwが自動的にcloseされる。
		// そして、pwが内包するBufferedWriterやFileWriterも連鎖的にcloseされる。

	}

}
