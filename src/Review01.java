
public class Review01 {

    public static void main(String[] args) {
        int nedan = 1500; // int型変数nedanの宣言し、1500を代入
        double zei = 0.1; // double型変数zeiの宣言し、0.1を代入
        int result;
        result = tax(nedan, zei);
        // 計算結果を表示する
        System.out.println
        (nedan + "円の商品の税込価格は"+ (nedan + result) + "円(消費税は"+ result +"円)です。");
    }
    // int型引数とdouble型引数を1つずつ受け取るtaxメソッドの定義（戻り値あり）
    public static int tax(int nedan, double zei) {
        int result = (int)(nedan * zei) ; // 計算結果をint型にキャスト
        return result;
    }
}
