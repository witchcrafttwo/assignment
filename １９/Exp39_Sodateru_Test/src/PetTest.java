public class PetTest {
    private String name;   // 名前
    private int energy;    // 元気（0〜100）
    private int hunger;    // 満腹度（0〜100）
    private int mood;      // 機嫌（0〜100）
    private int foodCost;  // 餌のコスト（円）

    // 飼い主の所持金（共有）
    private static int ownerMoney = 1000;

    public PetTest(String name) {
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
        UITest.printLine("こんにちは！わたしは「" + name + "」です。よろしくね！！");
    }

    // ごはん：満腹度上昇＋体力減少
    public void feed(int grade) { //①
        int cost;
        switch (grade) {
            case 1 -> { 
            	cost = foodCost;
            	moneycheck(ownerMoney,cost);
                hunger = hunger + 15;
                if(hunger >100){
                	hunger = 100;//②
                } //③
            }
            case 2 -> { 
            
            	cost = foodCost * 2; 
                hunger = hunger + 35;
                if(hunger >100){
                	hunger = 100;//②
                }//②
                //③
            }
            case 3 -> { 
            	cost = foodCost * 3;            
                hunger = hunger + 50;
                if(hunger >100){
                	hunger = 100;//②
                }
                 //③
            }
            default -> {
            	cost = foodCost;
                hunger = hunger + 15;
                if(hunger >100){
                	hunger = 100;//②
                }
                 
            }      
        }	
       
        	
        ownerMoney = ownerMoney - cost;  
        
        energy -= 10;            // 行動ペナルティ：体力↓
        UITest.printLine(name + "は【ランク" + grade + "】のごはんを食べた！（-" + cost + "円）");
        checkGameOver();         // 元気が0未満なら終了
    }
    public void moneycheck(int OM,int COST) {
    	 if(OM < COST) {
         	System.out.println("お金が足りないよ...");
         }
    }
    // 遊ぶ：機嫌上昇＋体力減少
    public void play() {
        mood = mood + 15; 
        energy = energy - 10; 
        UITest.printLine(name + "は楽しそうに遊んでいる！"); 
        checkGameOver();
    }

    // 休ませる：体力回復（唯一の例外）
    public void rest() {
        energy = energy + 20; 
        UITest.printLine(name + "はゆっくり休んで元気を取り戻した。"); 
    }

    // 働かせる：所持金上昇＋体力減少
    public void work() {
        int pay = 200; 
        ownerMoney = ownerMoney + pay; 
        energy = energy - 30; 
        UITest.printLine(name + "は一生けんめい働いて、" + pay + "円をかせいだ！"); //
        checkGameOver();
    }

    // 観察する：猫アートとパラメータを表示
    public void observe() {
        String art;
    
        // ①②疲労
        if (energy <= 20) {
             art = """
                    ／￣￣＼
                    （ ；・ω・）…ねむい
                    || っ  c
                    ||     
                    ￣Ｕ￣Ｕ
                    """;
        //③空腹
        } else if (hunger <= 50) {
            art = """
                    A____A
                    |｀ㅅ´|  ぐぅ…
                    |っ  c|
                    |     |
                    U￣￣U
                    """;
        // ④ご機嫌
        } else if (energy >= 60 && hunger >= 60 && mood >= 80) {
            art = """
                    A____A
                    |・ㅅ・|  にゃっ♪
                    |っ  c|
                    |  ^  |
                    U￣￣U
                    """;
        // ⑤デフォルト
        } else {
            art = """
                    A____A
                    |・ㅅ・|  
                    |っ  c|
                    |     |
                    U￣￣U
                    """;
        }  
        UITest.printLine(art);
        UITest.printLine("【観察結果】");
        UITest.printLine("元気：" + energy + "  満腹度：" + hunger + "  機嫌：" + mood);
    }

    // 体力チェック：0以下でゲームオーバー
    private void checkGameOver() {
        if (energy <= 0) {
            UITest.printLine ("--------------------------------");
            UITest.printLine("⚠ " + name + "は疲れすぎて倒れてしまった…");
            UITest.printLine("入院してしまいました、ゲームオーバーです。ペットは大事にしよう。");
            System.exit(0); // プログラム終了
        }
    }
}
