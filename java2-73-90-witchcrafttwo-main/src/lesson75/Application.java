package lesson75;

import java.io.File;
import java.util.Scanner;

class Application {
	
	private String fileName;
	
	
	public Application(String fileName) {
		this.fileName = fileName;
		
	}

	public void fileOpen() {
		
		// ファイルインスタンス生成
		File file = new File(fileName); 
		
		// FileNotFoundExceptionが発生する可能性があるので
		// 例外処理をしなければならない
		Scanner scanner = new Scanner(file); 
		
	}
}
