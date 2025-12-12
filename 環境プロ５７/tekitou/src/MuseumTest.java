
public class MuseumTest {
    public static void main(String[] args) {
        Exhibit[] exhibits = {
            new Painting("ひまわり", "ゴッホ", "油彩"),
            new Sculpture("ダビデ像", "ミケランジェロ", "大理石"),
            new VideoArt("都市の呼吸", "田中玲奈", 12)
        };

        for (Exhibit e : exhibits) {
            e.showLabel();
            e.displayInfo();
            System.out.println();
        }
    }
}