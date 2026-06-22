public class Calc {
    public static void main(String[] args) {
        System.out.println("--- 自動足し算プログラム ---");

        // 1から5までを自動で足し算したい
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            // ミス①: 文字列として表示したいが何かがおかしい？
            System.out.println(i + "を足します");
            
            // ミス②: 足し算をしたいのに…？
            total = i; 
        }

        // ミス③: 結果を表示したいが、変数名が…？
        System.out.println("合計は: " + goukei + " です");
    }
}