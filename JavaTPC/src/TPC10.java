import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
//	int, float, char, boolean -> PDT (기본 자료형)
    int a =10;
//  책(BookDTO)이라는 자료형을 만들자 --> class
//  객체생성
     BookDTO b = new BookDTO();
     b.title = "자바";
     b.price = 17000;
     b.company = "영찬";
     b.page = 670;
     
     System.out.println(b.title +"\t");
     System.out.println(b.price +"\t");
     System.out.println(b.company +"\t");
     System.out.println(b.page +"\t");
	}

}
