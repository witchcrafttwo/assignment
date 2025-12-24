package lesson78;

import java.io.IOException;
import java.sql.SQLException;

public class Ex2 {

	public static void main(String[] args) {

		Super2 su = new Sub2();
		
		try {
			// 呼び出し側は、変数suの型(Super2)がIOExceptionを
			// スローする可能性があることを知っている
			
			// IOExceptionとSQLExceptionは全く関係がないため、
			// ポリモーフィズムでSub2のmethod()が実行されると
			// SQLExceptionがスローされる可能性がある。			
			su.method();
			
			// 呼び出し側はそれを知らないため、SQLExceptionを
			// キャッチできない
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}

class Super2 {
	
	public void method() throws IOException {
		throw new IOException();
	}
}


class Sub2 extends Super2 {
	@Override
	public void method() throws SQLException {
		throw new SQLException();
	}
}