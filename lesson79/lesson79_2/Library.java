package lesson79_2;

import java.util.ArrayList;

public class Library {
	private ArrayList<String> books; //蔵書リスト
	
	Library() {
		books = new ArrayList<>();
	}
	
	void addBook(String title) throws ShosekiJuufukuException {
		if (books.contains(title)) {
			throw new ShosekiJuufukuException("すでに蔵書に登録されています。");
		}
		books.add(title);
		System.out.println(title + "を追加しました。");
	}
	
	void removeBook(String title) throws ShosekiMitsukaranaiException {
		if (!books.contains(title)) {
			throw new ShosekiMitsukaranaiException("蔵書に登録されていません。");
		}
		books.remove(title);
		System.out.println(title + "を削除しました。");
	}
	
	void showBooks() throws LibraryException {
		
		
		try {
			if (books.isEmpty()) {
				System.out.println("蔵書はありません。");
			} else {
				System.out.print("現在の蔵書:");
				for (String book : books) {
					System.out.print(" " + book);
				}
				System.out.println();
			}
		} catch (RuntimeException e) {
			throw new LibraryException("蔵書の表示中にエラーが発生しました。");
		}
	}
}
