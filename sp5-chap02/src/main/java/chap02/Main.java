package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
		new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println("(g1 == g2) = " + (g1 == g2));
//		System.out.println(g1.greet("스프링"));
		//스프링, 안녕하세요!
		ctx.close();
	}
}
//@Bean
		//public Greeter greeter(){
		//Greeter g = new Greeter();
		//g.setFormat("%s, 안녕하세요!");
		//return g;