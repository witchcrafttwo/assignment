package lesson74;

class FinallyWithReturn {

    public static int test() {
        try {
            System.out.println("tryブロック実行");
            return 1; // 戻り値1を準備してメソッドを抜けようとする
            
        } finally {
            // returnの直前にfinallyが実行される
            System.out.println("finallyブロック実行");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("メソッド呼び出し開始");
        int result = test();
        System.out.println("メソッドからの戻り値: " + result);
    }


}
