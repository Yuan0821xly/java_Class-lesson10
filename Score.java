
public class Score {
	//class変数の定義（全局变量）
	static int avr=0;
	static int sum=0;
	static int count=0;
	
	//instance変数の定義（field定义）
	int id;//(1000~)
	String name;
	int score;//(0~100)
	int rank;
	//1.class method（追加static,全局变量）:平均值
	static void Average(Score[] tbl) {
		for(int i=0;i<tbl.length;i++) {
			Score.sum+=tbl[i].score;
		}
		Score.avr=Score.sum/tbl.length;
	}
	//2.class method：count【平均値以上の人数】
	static void Count(Score[] tbl) {
		for(int i=0;i<tbl.length;i++) {
			if(tbl[i].score>=Score.avr) {
				count++;
			}
		}	
	}
	//constructor
	Score(int id,String name,int score){
		this.id=id;
		this.name=name;
		this.score=score;
	}
	//1.instance method
	void display() {
		System.out.println("学籍番号："+id);
		System.out.println("氏名："+name);
		System.out.println("成績点："+score);
		//System.out.println("順位："+rank);
	}
}
