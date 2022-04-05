package kr.tpc;

public class MemberVO {
  private String name;
  private int age;
  private String tel;  //정보은닉 = 정보보호
  private String addr;  // public 접근제한자로 지정해놓으면 잘못된 데이터가 들어가도 오류 없다.
  public MemberVO() {
   	  
  }
  // setter, getter method
  public void setName(String name) {
	this.name=name;
  }
  public String getName() {
	  return name;
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
