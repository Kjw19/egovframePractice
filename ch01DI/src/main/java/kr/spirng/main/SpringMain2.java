package kr.spirng.main;

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
import kr.spring.ch08.EmailSender;
import kr.spring.ch08.WorkController;
import kr.spring.ch09.UploadController;
import kr.spring.ch10.PerformanceMonitor;

public class SpringMain2 {

	public static void main(String[] args) {
		//applicationContext2.xml 설정 파일을 읽어들여 스프링 컨테이너를 생성
		//스프링컨테이너 생성
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//DI 프로퍼티 설정 방식
		RegisterService service =(RegisterService)context.getBean("registerService");
		WorkController work = (WorkController)context.getBean("work");
		
		//XMl 네임 스페이스를 이용한 프로퍼티 설정
		UploadController upload = (UploadController)context.getBean("upload");

		//List 타입 프로퍼티 설정
		PerformanceMonitor monitor = (PerformanceMonitor)context.getBean("performanceMonitor");
		
		
		System.out.print("ch07 : ");
		service.write();
		
		System.out.print("ch08 : ");
		System.out.println(work);

		System.out.print("ch09 : ");
		System.out.println(upload);
		
		System.out.print("ch10 : ");
		System.out.print(monitor);
		
		
		//어플리케이션 종료 시 컨테이너에 존재하는 모든 빈(객체)를 종료
		context.close();
	}
	
}
