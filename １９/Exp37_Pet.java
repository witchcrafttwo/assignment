public class Pet {
    private String name;   // 名前
    private int energy;    // 元気（0〜100）
    private int hunger;    // 満腹度（0〜100）
    private int mood;      // 機嫌（0〜100）
    private int foodCost;  // 餌のコスト（円）

    // 飼い主の所持金（共有）
    private static int ownerMoney = 1000;

    public Pet(String name) {
        this.name = name;
        this.energy = 60;
        this.hunger = 60;
        this.mood = 60;
        this.foodCost = 120;
    }

    // 所持金の参照用（UIから表示に使う）
    public static int getOwnerMoney() {
        return ownerMoney;
    }

    // 自己紹介：ゲームスタート時に挨拶をする
    public void selfIntro() {
        UI.printLine("こんにちは！わたしは「" + name + "」です。よろしくね！！");
    }

    // ごはん：満腹度上昇＋体力減少
    public void feed() {
        ownerMoney = ownerMoney - foodCost; 
        hunger = hunger + 25;
        energy = energy - 10; 
        UI.printLine(name + "はおいしそうにごはんを食べた！（-" + foodCost + "円）"); 
        checkGameOver();
    }

    // 遊ぶ：機嫌上昇＋体力減少
    public void play() {
        mood = mood + 15; 
        energy = energy - 10; 
        UI.printLine(name + "は楽しそうに遊んでいる！"); 
        checkGameOver();
    }

    // 休ませる：体力回復（唯一の例外）
    public void rest() {
        energy = energy + 20; 
        UI.printLine(name + "はゆっくり休んで元気を取り戻した。"); 
    }

    // 働かせる：所持金上昇＋体力減少
    public void work() {
        int pay = 200; 
        ownerMoney = ownerMoney + pay; 
        energy = energy - 30; 
        UI.printLine(name + "は一生けんめい働いて、" + pay + "円をかせいだ！"); //
        checkGameOver();
    }

    // 観察する：猫アートとパラメータを表示
    public void observe() {
        UI.printLine("A____A"); 
        UI.printLine("|・ㅅ・|");
        UI.printLine("|っ  c|");
        UI.printLine("|     |");
        UI.printLine("U￣￣U");
        UI.printLine("【観察結果】"); 
        UI.printLine("元気：" + energy + " 満腹度：" + hunger + " 機嫌：" + mood);
    }

    // 体力チェック：0以下でゲームオーバー
    private void checkGameOver() {
        if (energy <= 0) {
            UI.printLine ("--------------------------------");
            UI.printLine("⚠ " + name + "は疲れすぎて倒れてしまった…");
            UI.printLine("入院してしまいました、ゲームオーバーです。ペットは大事にしよう。");
            System.exit(0); // プログラム終了
        }
    }
}
