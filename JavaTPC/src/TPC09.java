
public class TPC09 {

	public static void main(String[] args) {
     int a =56;
     int b =40;
     // a + b = ?
     //int v = sum(a,b)
     TPC09 tp = new TPC09(); // heap Area(힙)
     int c = tp.sum(a, b);
     System.out.println(c); // 96

	}
   public int sum(int a, int b) {
	   int v = a + b;
	   return v;
   }
}
