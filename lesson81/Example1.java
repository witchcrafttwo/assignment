package lesson81;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) {
		// finallyブロックを使った旧来のクローズ処理
		File file = new File("output.txt");
		FileReader fr = null; // tryブロックの外で宣言
		BufferedReader br = null; 

		try {
		    fr = new FileReader(file);
		    br = new BufferedReader(fr);
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		    
		} finally {
		    // BufferedReaderをクローズ
		    if (br != null) {
		        try {
		            br.close(); // 
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
            // FileReaderも明示的にクローズ 
		    // BufferedReaderをクローズすればFileReaderも自動的にクローズされるが、
		    // 念のために行っている
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
		}

	}

}
