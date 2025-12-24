package lesson74;

class Program3 {

	public static void main(String[] args) {

	    try {
			// コマンドライン引数を処理する
			int value = Integer.parseInt(args[0]);
			System.out.println("入力値: " + value);
			
		} catch (NumberFormatException e) {
			System.out.println("入力データが不正です");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("入力データが不正です");
		}

	}

}
