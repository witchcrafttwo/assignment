import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        UITest.printTitle(); 
        UITest.waitStart(sc); 

        String name = UITest.inputName(sc); 
        PetTest pet = new PetTest(name);
        pet.selfIntro(); 

        boolean gameFlag = true; 

        while (gameFlag) {
            UITest.printMenu();                
            int cmd = sc.nextInt();        

            switch (cmd) { 
                case 1:
                    int grade = UITest.chooseFoodGrade(sc);
                    pet.feed(grade);
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
                    UITest.printLine("またあそんでね！");
                    gameFlag = false;      // フラグを下げてループを終了
                    break;
                default:
                    UITest.printLine("コマンドが正しくありません。");
                    break;
            }
            System.out.println(); // 見やすさのための空行
        }
        sc.close(); // ループを抜けてからクローズ
    }
}
