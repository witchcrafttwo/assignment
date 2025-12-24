package lesson80;

import java.io.File;
import java.io.IOException;

class FileWriterExample {

	public static void main(String[] args) {

		try {
			// "output.txt" というファイルへのパスを管理するFileオブジェクトを生成
			File file = new File("output.txt");
	
			// 主なメソッド
			System.out.println("ファイルは存在するか: " + file.exists());
			System.out.println("ファイル名: " + file.getName());
			System.out.println("絶対パス: " + file.getAbsolutePath());
			
			// ファイルを新規作成 (IOExceptionが発生する可能性あり)
			file.createNewFile();

			// FileWriterの使用例（どのファイルに書き込むかを指定）
			
			


			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
