package lesson74;

import java.util.Scanner;

class Program1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("年齢を入力してください: ");
		
		// 数値以外の入力をするとエラーが発生する
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("あなたの年齢は " + age + " 歳です。");
		
		scanner.close();
	}

}
