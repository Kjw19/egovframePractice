package kr.spring.ch18;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//자바 코드 기반 설정
//설정 파일을 만들지 않고 설정을 담당하는 클래스를 구현

@Configuration
public class SpringConfig {
	
	//@Bean 어노테이션을 명시함으로써 bean 객체 설정
	//@Bean을 명시해서 빈 객체를 생성할 때는 메서드 명을
	//빈 객체의 이름으로 사용
	//@Bean("빈 이름") 이와 같이 빈 이름을 지정할 수 있음.
	//@Bean
	//@Named("빈 이름")은 허용되지 않는다
	@Bean 
	public Worker worker() {
		return new Worker();
	}
	
	@Bean
	public Executor executor() {
		return new Executor();
	}

}
