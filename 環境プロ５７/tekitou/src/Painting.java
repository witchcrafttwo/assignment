class Painting extends Exhibit {
    private String medium;

    public Painting(String title, String artist, String medium) {
        super(title, artist);
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        System.out.println("【絵画】" + title + " / 作者：" + artist + " / 技法：" + medium);
    }
}
