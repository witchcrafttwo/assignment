
public class Kaimono_02 {

	public static void main(String[] args) {
		
		// 友達を作成（インスタンス化）
		Friend tanaka = new Friend();
		tanaka.no = 3;
		tanaka.name	= "田中";

		Friend sato = new Friend();
		sato.no = 6;
		sato.name = "佐藤";
		
		Friend shiori = new Friend();
		shiori.no = 5;
		shiori.name = "しおり";
		
		Friend kido = new Friend();
		kido.no = 2;
		kido.name = "喜怒";
		
		// 買い物を頼む
		sato.kaimono();
		shiori.kaimono();
		kido.kaimono();
	}

}
