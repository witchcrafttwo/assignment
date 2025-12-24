package lesson80;

import java.io.File;

class FileExample {

	public static void main(String[] args) {
		// "output.txt" というファイルへのパスを管理するFileオブジェクトを生成
		File file = new File("output.txt");

		// 主なメソッド
		System.out.println("ファイルは存在するか: " + file.exists());
		System.out.println("ファイル名: " + file.getName());
		System.out.println("絶対パス: " + file.getAbsolutePath());

		// file.createNewFile(); // ファイルを新規作成 (IOExceptionが発生する可能性あり)
		// file.delete();       // ファイルを削除

	}

}
