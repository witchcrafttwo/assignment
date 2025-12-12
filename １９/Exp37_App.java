import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        UI.printTitle(); 
        UI.waitStart(sc); 

        String name = UI.inputName(sc); 
        Pet pet = new Pet(name);
        pet.selfIntro(); 

        boolean gameFlag = true; 

        while (gameFlag) {
            UI.printMenu();                
            int cmd = sc.nextInt();        

            switch (cmd) { 
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.rest();
                    break;
                case 4:
                    pet.work();
                    break;
                case 5:
                    pet.observe();
                    break;
                case 9:
                    UI.printLine("またあそんでね！");
                    gameFlag = false;      // フラグを下げてループを終了
                    break;
                default:
                    UI.printLine("コマンドが正しくありません。");
                    break;
            }
            System.out.println(); // 見やすさのための空行
        }
        sc.close(); // ループを抜けてからクローズ
    }
}
