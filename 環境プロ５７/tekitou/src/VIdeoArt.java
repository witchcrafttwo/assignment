class VideoArt extends Exhibit {
    private int duration;

    public VideoArt(String title, String artist, int duration) {
        super(title, artist);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("【映像作品】" + title + " / 作者：" + artist 
                           + " / 再生時間：" + duration + "分");
    }
}