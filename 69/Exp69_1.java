import java.util.ArrayList;
public class Exp69_1 {
    public static void main(String[] args) {
      ArrayList<String> listName = new ArrayList<>();
      boolean found = false;
      listName.add("佐藤");
      listName.add("鈴木");
      listName.add("高橋");
      listName.add("田中");
      listName.add("伊藤");
      listName.add("渡辺");
      listName.add("山本");
      listName.add("佐藤");
      listName.add("小林");
      listName.add("加藤");
    
        for(int i = 0; i < listName.size(); i++) {
            if(listName.get(i).equals("小林")){
                 found = true;
            }
        }
        if(found) {
            System.out.println("小林さんは見つかりました");
        } else {
            System.out.println("小林さんは見つかりませんでした");
        }
        if(listName.contains("佐藤")) {
            System.out.println("佐藤さんは見つかりました");
        } else {
            System.out.println("佐藤さんは見つかりませんでした");
        }
        for(int i : listName) {
            
        }

    }
}