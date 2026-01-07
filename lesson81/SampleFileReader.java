package lesson81;

class SampleFileReader {

	public static void main(String[] args) {
		
		
		File file = new File("output.txt"); // ファイルを準備する
		FileReader reader = new FileReader(file); // ファイルからの入力ストリームを開く

		char[] buffer = new char[128]; // データを一時的に格納する文字配列
		int length = reader.read(buffer); // bufferに読み込み、読み取った文字数を返す

		// 読み取った文字配列を文字列に変換して表示
		String content = new String(buffer, 0, length);
		System.out.println(content);

	}

}
