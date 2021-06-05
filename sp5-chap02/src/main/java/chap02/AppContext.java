package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean //@Bean이 붙은 메서드의 이름은 빈(Bean) 객체를 구분할 때 사용
	//Bean객체는 스프링이 생성하는 객체 
	public Greeter greeter() {
		Greeter g = new Greeter(); //Greeter객체 초기화
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
//9행부터 14행까지는 코드가 한 개 객체를 생성하고 초기화 하는 설정을 담고 있음
}
