package kr.spring.ch14;

import java.awt.print.Book;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringMain3 {

	public static void main(String[] args) {
		//applicationContext2.xml 설정 파일을 읽어들여 스프링 컨테이너를 생성
		//스프링컨테이너 생성
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext3.xml");
		/*
		 * 빈 객체의 타입인 이름을 이용하여 의존 관계를 자동으로 설정할 수 있는 기능
		 * bean 태그의 autowire 속성에 지정할 수 있는 값
		 * byName : 프로퍼티의 이름과 같은 이름을 갖는 빈 객체를 설정
		 * 
		 * byType : 프로퍼티의 타입과 같은 타입을 갖는 빈 객체를 설정
		 * 
		 * Constructor : 생성자 파라미터 타입과 같은 타입을 갖는 빈 객체를 생성자
		 * 		에 전달

		 * */
		//프로퍼티 이름을 이용한 의존 관계 자동 설정
		SystemMonitor monitor = (SystemMonitor)context.getBean("systemMonitor");
		
		System.out.print("ch14 : ");
		System.out.print(monitor);

		//어플리케이션 종료 시 컨테이너에 존재하는 모든 빈(객체)를 종료
		context.close();
	}
	
}
