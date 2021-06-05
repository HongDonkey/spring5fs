package chap02;

public class Greeter {
	private String format;

	public String greet(String guest) {
		return String.format(format, guest);
		//String의 문자열 포맷을 이용해서 새로운 문자열을 생성
		//메시지 생성
	}

	public void setFormat(String format) {
		this.format = format;
		//문자열 포맷 지정
	}
//Greeter greeter = new Greeter();
//greeter.setFormat("%s, 안녕하세요!");
//String msg = greeter.greet("스프링");
	//msg는 "스프링, 안녕하세요!"
	

}
