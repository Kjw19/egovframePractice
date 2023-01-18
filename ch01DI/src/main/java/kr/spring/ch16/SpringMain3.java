package kr.spring.ch16;

import java.awt.print.Book;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringMain3 {

	public static void main(String[] args) {
		//applicationContext2.xml 설정 파일을 읽어들여 스프링 컨테이너를 생성
		//스프링컨테이너 생성
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext3.xml");

		//@Resource 어노테이션을 이용한 의존 관계 자동 설정
		HomeController home = (HomeController)context.getBean("homeController");
		
		System.out.print("ch15 : ");
		System.out.print(home);

		//어플리케이션 종료 시 컨테이너에 존재하는 모든 빈(객체)를 종료
		context.close();
	}
	
}
