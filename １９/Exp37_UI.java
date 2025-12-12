import java.util.Scanner;

// 画面表示と入力
public class UI {
    public static void printTitle() {
        System.out.println("=== ペット育成シミュレーション：ソダテル ===");
    }

    public static void waitStart(Scanner sc) {
        boolean startFlag = false; 
        while (!startFlag) {
            System.out.print("「1」を押してゲームスタート > "); 
            int key = sc.nextInt(); 

            if (key == 1) { 
                startFlag = true;
            } else { 
            System.out.println("1キーを押してください。");
            }
        }
    }

    public static String inputName(Scanner sc) { 
        System.out.print("はじめに、ペットの名前を入力してください > "); 
        return sc.next(); 
    }

    public static void printMenu() {
        System.out.println("--------------------------------"); 
        System.out.println("所持金：" + Pet.getOwnerMoney() + "円"); 
        System.out.println("1: ごはんをあげる  2: 遊ぶ  3: 休ませる  4: 働かせる  5: 観察する  9: 終了");
        System.out.print("> コマンドを選んでください："); 
    }

    public static void printLine(String msg) {
        System.out.println(msg);
    }
}
