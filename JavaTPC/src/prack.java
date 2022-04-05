import kr.tpc.Inflearn;
import kr.tpc.MemberVO;

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
	
	}
  public int sum(int a, int b) {
	  int c = a + b;
	return c;
	  
  }
}
