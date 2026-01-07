package lesson81;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SampleBufferedReader {

	public static void main(String[] args) {
		
		// BufferedReaderを使った効率的な読み込み
		File file = new File("output.txt"); // ①ファイルを準備する
		FileReader fr = new FileReader(file); // ②FileReaderクラスを準備する
		BufferedReader br = new BufferedReader(fr); // ③BufferedReaderクラスを準備する

		String line;
		// readLine()の戻り値がnullになるまで、1行ずつ読み込みと表示を繰り返す
		while ((line = br.readLine()) != null) {
		    System.out.println(line);
		}

		br.close(); // ストリームを閉じる


	}

}
