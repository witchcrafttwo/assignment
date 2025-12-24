package lesson73;

import java.util.Scanner;

class Program1 {

	public static void main(String[] args) {

		sample1();
		sample2();
		sample3();
	}

	// ケース①：数値入力の失敗
	private static void sample1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("年齢を入力してください: ");
		
		// 数値以外の入力をするとエラーが発生する
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("あなたの年齢は " + age + " 歳です。");
		
		scanner.close();
		
	}
	
	// ケース②：ファイルが存在しない
	private static void sample2() {
		/*
		
		// data.txtファイルが存在しなければエラーが発生する
		File file = new File("data.txt");
		Scanner fileScanner = new Scanner(file); 

		// 文字(行)がある限り画面に出力する
		while (fileScanner.hasNextLine()) { 
			System.out.println(fileScanner.nextLine());
		}
		
		fileScanner.close();
		
		*/

	}
	
	// ケース③: ゼロ除算
	private static void sample3() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("割られる数を入力: ");
		int dividend = scanner.nextInt();
		
		System.out.print("割る数を入力: ");
		int divisor = scanner.nextInt(); // 0が入力された場合
		        
		// 0除算のためエラーが発生する
		int result = dividend / divisor;
		        
		System.out.println("計算結果: " + result);
		
		scanner.close();

	}
	
}
