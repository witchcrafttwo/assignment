package lesson77;

class AtmSystem {

    static int balance = 5000;	// 口座残高

    public static void main(String[] args) {
    	
        try {
			withdraw(6000);
			
		} catch (Exception e) {
			System.out.println(">>> エラー: " + e.getMessage());
		}
    }

    // 【問題】
    // 残高不足の場合に独自例外（ZandakaException）を
    // スローするように変更してください
    static void withdraw(int amount) throws Exception {
        
        if (balance < amount) {
            throw new Exception("残高不足です");
        }

        balance -= amount;
        System.out.println(">>> 現金を引き出します: " + amount + "円");
    }


}
