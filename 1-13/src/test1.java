import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList(Arrays.asList("f", "u", "k", "u", "d", "a", "k" , "a" , "n" , "e" , "k" , "o" ));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();

		loop : for(int a = 2; a < strArray1.size(); a++) {
			strArray2.add(strArray1.get(a));

			for(int b = 0; b < strArray2.size(); b++) {
				if(strArray2.get(b).equals("k") || strArray2.get(b).equals("a") || strArray2.get(b).equals("o")) {
					strArray3.add(strArray2.get(b));
				}

				for(int c = 0; c < strArray3.size(); c++) {
					if(strArray4.size() == 0 && strArray3.get(c).equals("k")) {
						strArray4.add(0,strArray3.get(c));

					}else if(strArray4.size() == 1 && strArray3.get(c).equals("a")) {
						strArray4.add(1,strArray3.get(c));

					}else if(strArray4.size() == 2 && strArray3.get(c).equals("k")) {
						strArray4.add(2,strArray3.get(c));

					}else if(strArray4.size() == 3 && strArray3.get(c).equals("a")) {
						strArray4.add(3,strArray3.get(c));

					}else if(strArray4.size() == 4 && strArray3.get(c).equals("o")) {
						strArray4.add(4,strArray3.get(c));
						break loop;
					}
				}
			}
		}
		System.out.println(strArray4);
	}

}

