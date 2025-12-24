import java.util.ArrayList;
public class ObjList {
    
    
    public static void main(String[] args){
        Ingredient recipe1 = new Ingredient();
        recipe1.setIngredient("砂糖", 100);

        Ingredient recipe2 = new Ingredient();
        recipe2.setIngredient ("塩", 50);

        Ingredient recipe3 = new Ingredient("牛乳", 150);
        Ingredient recipe4 = new Ingredient("はちみつ", 30);

        ArrayList<Ingredient> recipiList = new ArrayList<>();
        recipiList.add(recipe1);
        recipiList.add(recipe2);
        recipiList.add(recipe3);
        recipiList.add(recipe4);

        System.out.println(recipiList);

    }
}