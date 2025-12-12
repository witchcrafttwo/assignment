abstract class Exhibit {
    protected String title;
    protected String artist;

    public Exhibit(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void showLabel() {
        System.out.println("作品ラベルを表示します。");
    }

    public abstract void displayInfo();
}
