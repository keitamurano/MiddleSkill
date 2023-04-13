import java.util.Scanner;
import java.util.logging.Logger;
public class checkTest {
	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());
	
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
        // [Ctrl + Shift + R]
		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
		// [Shift + Alt + R]
		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
		// ブレークポイントを置いて、デバッグ実行、ブレークポイントに止まる、ステップインやステップリターン・ステップオーバー等を使い、意図しない動きになっていないかを探す。
		//改行
		System.out.println("問４");
		//問4 Javaのバージョン8と11の違いを簡潔に答えてください
		// 型推論が使えるようになった。interfaceにprivateメソッドの導入。_を変数名に使用できなくなった。
		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		Scanner sc = new Scanner(System.in);
		System.out.println("チームの人数を入力してください");
		int teamMember = sc.nextInt();
		
		int price;
		
		if(teamMember < 10) {
			price = 1000 * teamMember;
			
		}else if(teamMember >= 10 && teamMember < 20) {
			price = 820 * teamMember;
			
		}else {
			price = 700 * teamMember;
		}
		System.out.println("入場料は" + price + "円です。");
		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;
		
		// scoreの配列にある要素数（5回）だけfor文を回し得点を入力させる。
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
			}


			// 入力された値をsumに代入して、入力された数だけ足している。
			sum = 0;
			for (i = 0; i < score.length; i++) {
			sum += score[i];
			}
		
			// 合計された得点から平均値の計算をして、aveに代入する
			ave = sum / (double)score.length;
			// aveの出力
			System.out.println("平均値 = " + ave);
		
		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを修正してください
		String message = "Hello World!";
		LOGGER.info("The message is: " + message);
		
		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
		//2.入力された文字列が空文字列の場合（Exceptionが発生する）
		//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）
		Scanner sc2 = new Scanner(System.in);
		System.out.println("値を入力してください。");
		String str = sc2.next();
		
		try {
			if(str == null) {
				throw new NullPointerException();
			}
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
//		try {
//			System.out.println(num);
//			
//		}catch(NullPointerException e) {
//			System.out.println(e);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
     	//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//『難しいところも多々ありましたが、楽しくできました。』
	}
}
