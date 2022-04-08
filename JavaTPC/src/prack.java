import kr.tpc.Inflearn;
import kr.tpc.MemberVO;
import kr.tpc.MovieVO;

public class prack {

	public static void main(String[] args) {
	TPC09 tpc = new TPC09();
	int b =tpc.sum(40, 56);
	System.out.println(b);
	
	/*Human hu = new Human();
	hu.address ="경기도 부천시";
	hu.height = 175.5;
	hu.name = "홍길동";
	hu.phone = "010-2657-9875";
	
	System.out.println(hu.address + "\t");
	System.out.println(hu.height + "\t");
	System.out.println(hu.name + "\t");
	System.out.println(hu.phone + "\t");*/

//	Inflearn inf =new Inflearn();
	
	Inflearn.tpc();
	Inflearn.java();
	
	MemberVO m = new MemberVO();
	m.setName("홍길동");
	m.setAge(45);
	m.setTel("010-7752-8545");
	m.setAddr("홍콩");
	
	System.out.println(m);
	
	MemberVO m1 = new MemberVO();
	m1.setName("유관순");
	m1.setAge(17);
	m1.setTel("010-5475-2142");
	m1.setAddr("안산");
	
	System.out.println(m1.toString());
	
	int[] num = new int[5];
	num[0] = 10;
	num[1] = 20;
	num[2] = 30;
	num[3] = 40;
	num[4] = 50;
	
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
		}
	
	MovieVO[] marr= new MovieVO[3];
	marr[0] = new MovieVO("캐리비안의 해적", 15000, "조니뎁", 3, 1.8f);
	marr[1] = new MovieVO("캐리비안의 해적2", 20000, "해리", 7, 1.2f);
	marr[2] = new MovieVO("캐리비안의 해적3", 18000, "존슨", 9, 1.4f);
	
	for(MovieVO name : marr) {
		System.out.println(name);
		}
	}
  public int sum(int a, int b) {
	  int c = a + b;
	return c;
	  
  }
}
