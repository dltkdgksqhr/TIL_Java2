package kr.tpc;

public class MemberVO {
  private String name;
  private int age;
  private String tel;
  private String addr;

public MemberVO() { }
public MemberVO(String name, int age, String tel, String addr) {
	this.name = name;
	this.age = age;
	this.tel = tel;
	this.addr = addr;
} //생성자를 인위적으로 하나 만들면 자동으로 기본 생성자가 생성이 안되므로 직접 기본 생성자 만들어줘야한다.
@Override
public String toString() {
	return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
}
// toString 메소드는 MemberVO클래스가 가지고 있는 멤버 변수를 한번에 출력 가능하게 만들어준다.
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
  
}
