import java.util.Scanner;

public class section_10 {
	public static void main(String[]args) {
	//入力：人数
		Scanner in=new Scanner(System.in);
		System.out.println("人数を入力してください＝＞");
		int N=in.nextInt();
				
		Score[] tbl=new Score [N];
				
		for(int i=0;i<N;i++) {
			System.out.println("学籍番号を入力してください＝＞");
			int id=in.nextInt();
			System.out.println("氏名を入力してください＝＞");
			String name=in.next();
			System.out.println("成績点を入力してください＝＞");
			int score=in.nextInt();
			tbl[i]=new Score(id,name,score);	
		}
		
		for(int j=0;j<N;j++) {
			System.out.println("------------------");
			tbl[j].display();
		}
		
		Score.Average(tbl);
		Score.Count(tbl);
		System.out.println("------------------");
		System.out.println("成績の平均点は："+Score.avr);
		System.out.println("平均点以上の人数は："+Score.count);
		
		in.close();
	}
}
