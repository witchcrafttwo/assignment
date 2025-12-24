package lesson80;

class BufferedWriterExample {

	public static void main(String[] args) {

		// BufferedWriterを使った効率的な書き込み（例外処理は省略）
		// ①Fileクラスを作る
		//File file = new File("memo.txt");
		
		// ②Fileクラスを使ってFileWriterクラスを作る
		//FileWriter fw = new FileWriter(file);
		
		// ③FileWriterクラスを使ってBufferedWriterクラスを作る
		//BufferedWriter bw = new BufferedWriter(fw); 

		bw.write("1行目の文章です。");
		bw.newLine(); // 改行を出力する専用のメソッド。(\nを書くより安全)

		bw.write("2行目の文章です。");
		bw.newLine();

		bw.close(); // BufferedWriterを閉じれば、内側のFileWriterも自動的に閉じられる

		
	}

}
