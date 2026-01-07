package lesson82;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
class BookReviewWriter {

	public static void main(String[] args) {
        String fileName = "booklist.txt";
        
        // 読んだ本のリストをArrayListで管理
        ArrayList<BookReview> books = new ArrayList<BookReview>();
        BookReview book1 = new BookReview("ハリー・ポッターと賢者の石", "魔法の世界に引き込まれた!続きが気になる");
        books.add(book1);

        // 要素を直接追加する方法が簡単
        books.add(new BookReview("夜は短し歩けよ乙女", "独特な文体が面白い。京都に行きたくなった"));
        books.add(new BookReview("嫌われる勇気", "アドラー心理学が分かりやすく学べた。考え方が変わった"));
        
        // try-with-resources文でリソースを宣言
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            
            // printlnで様々なデータ型の値を出力
            pw.println("========== 読書記録 ==========");
            pw.print("登録冊数: ");
            pw.println(books.size()); // ArrayListのサイズを出力
            pw.println();
            
            // ArrayListの各要素をforeachで取り出してファイルに出力
            for (________________) {
                pw.println(___________________);
            }
            
            pw.println("==============================");
            
            System.out.println("'" + fileName + "'に読書記録を保存しました。");
            
        } catch (______________ e) {
            System.err.println("ファイル書き込み中にエラーが発生しました。");
            e.printStackTrace();
        }

	}

}
