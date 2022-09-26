package my.app;

// to import --> ctrl+shift+o 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	//main ctrl+space enter
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		OracleCon con = (OracleCon)ac.getBean("con"); // pass bean id
		System.out.println(con);
	}
}
