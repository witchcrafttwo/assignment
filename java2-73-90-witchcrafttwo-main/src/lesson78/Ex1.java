package lesson78;

import java.io.IOException;

class Ex1 {

	public static void main(String[] args) {
		Super1 su = new Super1();
		try {
			su.method();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class Super1 {
	public void method() throws IOException {
		
	}
}

/* Superクラスのmethod()をオーバーライドする
 * Subクラスを定義してください。
 * 例外のオーバーライドは選択肢の中から正しいものを選んでください。
 * 
 * 選択肢:
 * 　a) Exception
 * 　b) FileNotFoundException
 * 　c) SQLException
 * 　d) IOException, SQLException
 */
class Sub1 extends Super {
	
	@Override
	
	
}