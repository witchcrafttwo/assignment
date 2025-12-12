
public class Friend {
	int no;			// 出席番号
	String name;	 	// 名前
	
	// 買い物に行くメソッド
	int kaimono(int money) {
		int juicePrice = 150;
		System.out.println(name + "さんはジュースを買ってきた");
		int otsuri = money - juicePrice;
		return otsuri;
	}
	
	// 買い物に行くメソッド(手数料あり版)
    int kaimono(int money, int tesuuryou) {
        int juicePrice = 150;  // ジュースの値段
        System.out.println(name + "さんは" + juicePrice + "円のジュースを買ってきた");
        System.out.println("手数料として" + tesuuryou + "円もらいます");
        int otsuri = money - juicePrice - tesuuryou;
        return otsuri;  // おつりを返す
    }

}
