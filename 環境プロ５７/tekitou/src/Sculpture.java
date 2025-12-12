class Sculpture extends Exhibit {
    private String material;

    public Sculpture(String title, String artist, String material) {
        super(title, artist);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("【彫刻】" + title + " / 作者：" + artist + " / 材質：" + material);
    }
}
