package kr.spring.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.spring.ch01.MessageBean;
import kr.spring.ch02.StudentBean;
import kr.spring.ch03.OperatorBean;
import kr.spring.ch04.WriteArticleService;
import kr.spring.ch05.MemberService;
import kr.spring.ch06.SmsSender;
import kr.spring.ch06.SystemMonitor;
import kr.spring.ch07.RegisterService;

public class SpringMain {

	public static void main(String[] args) {
		//applicationContext.xml 설정 파일을 읽어들여 스프링 컨테이너를 생성
		//스프링컨테이너 생성
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//객체를 컨테이너로부터 읽어들임
		MessageBean messageBean = (MessageBean)context.getBean("messageBean");
		StudentBean studentBean = (StudentBean)context.getBean("studentBean");
		OperatorBean operatorBean = (OperatorBean)context.getBean("operatorBean");
		
		//컨테이너에 Di생성자 설정방식으로 생성된 객체를 읽어들임
		WriteArticleService articleService = 
				(WriteArticleService)context.getBean("writeArticleService");
		
	
		MemberService service = (MemberService)context.getBean("memberService"); 
		
		//DI생성자 방식으로 인자에 객체 전달
		SystemMonitor monitor = (SystemMonitor)context.getBean("monitor");
		
		System.out.print("ch01 : ");
		messageBean.sayHello("장영실");
		
		System.out.print("ch02 : ");
		studentBean.study("국어");

		System.out.println("ch03 : 결과 = " + operatorBean.add(10, 20));
		
		System.out.print("ch04 : ");
		articleService.wirte();
		
		System.out.print("ch05 : ");
		service.send();
		
		System.out.print("ch06 : ");
		System.out.print(monitor);
		
		//어플리케이션 종료 시 컨테이너에 존재하는 모든 빈(객체)를 종료
		context.close();
	}
	
}
