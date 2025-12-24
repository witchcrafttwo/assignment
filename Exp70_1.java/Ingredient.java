public class Ingredient {
    private String name;
    private int amount;

    public void setIngredient(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public Ingredient(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public Ingredient() {}

    public String toString() {
        return name + ": " + amount + "ml";
    }


}