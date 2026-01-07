package lesson81;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class AddressSearch {

	public static void main(String[] args) {

		File file = new File("38EHIME.CSV");
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(file,StandardCharsets.UTF_8); // UTF-8で読み込み
			br = new BufferedReader(fr);
			
			String line;
			while( (line = br.readLine()) != null) {
				if( line.contains("7900825") ) {
					String[] fields = line.split(",");
					System.out.println(fields[6] + fields[7] + fields[8]);
				}
			}
			
		}catch (Exception e) {
			System.out.println("ファイルの読み込みに失敗しました。");
			
			
		}finally {
			if( br != null ) { // frも同時にクローズされる
				try {
					br.close();
				}catch (Exception e) {
					System.out.println("ファイルのクローズに失敗しました。");
				}
			}
		}
		
	}

}
