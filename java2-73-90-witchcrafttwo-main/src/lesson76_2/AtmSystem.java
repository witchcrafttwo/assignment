package lesson76_2;

class AtmSystem {

    static int balance = 5000;	// 口座残高

    public static void main(String[] args) {
        // この問題ではmainメソッドには何も記述しません。
        // まずは下の withdraw メソッドのエラーを解消してください。
    }

    // 【問題】
    // 以下のメソッドには2つの文法間違いがあります。
    // キーワードを正しく修正してください。
    static void withdraw(int amount) throw Exception {
        
        if (              ) {
            throws new Exception("残高不足です");
        }

        balance -= amount;
        System.out.println(">>> 現金を引き出します: " + amount + "円");
    }


}
