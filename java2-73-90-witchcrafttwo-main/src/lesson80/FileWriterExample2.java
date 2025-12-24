package lesson80;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterExample2 {

	public static void main(String[] args) {
		
		FileWriter writer = null;

		try {
			// "output.txt"ファイルを管理するFileオブジェクトを生成
			File file = new File("output.txt");
	
			// 主なメソッド
			System.out.println("ファイルは存在するか: " + file.exists());
			System.out.println("ファイル名: " + file.getName());
			System.out.println("絶対パス: " + file.getAbsolutePath());

			// ファイルを新規作成 (IOExceptionが発生する可能性あり)
			file.createNewFile();
			
			// FileWriterの使用例（どのファイルに書き込むかを指定）
			writer = new FileWriter(file);
			writer.write("日別売上データ\n");
			writer.write("2000円\n");
			writer.write("4000円\n");
			
			writer.flush(); // ストリームの内容を強制的に書き込む
			
			
		} catch (IOException e) {
			System.out.println("ファイル操作中にエラーが発生");
			
		} finally {
			
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				} 
			} 
		}

	}

}
