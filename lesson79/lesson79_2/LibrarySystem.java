package lesson79_2;

public class LibrarySystem {

	public static void main(String[] args) {

		Library library = new Library();
		
		try {
			library.addBook("吾輩は猫である");
			library.addBook("坊ちゃん");
			library.addBook("こころ");
			library.showBooks();
			library.addBook("坊ちゃん");
			library.removeBook("坊ちゃん");
			library.removeBook("人間失格");
			
		} catch (ShosekiJuufukuException e) {
			System.out.println(e.getMessage());
			
		} catch (ShosekiMitsukaranaiException e) {
			System.out.println(e.getMessage());
			
		} catch (LibraryException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("図書館システムを終了します。");
		}
		
		
	}

}
