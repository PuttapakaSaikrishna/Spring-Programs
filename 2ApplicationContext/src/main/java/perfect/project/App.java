package perfect.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");//Application Context
		// by using the Ioc object we are requestion the ioc to supply obj for airtel
		// class

		 Airtel airte=(Airtel)ac.getBean("airtel");
		//Airtel airte = ac.getBean(Airtel.class);
		airte.dtatypesim();
		airte.typeofsim();
		System.out.println(airte.getDataStrength());

		 Idea idea=(Idea) ac.getBean("idea");
		//Idea idea = ac.getBean(Idea.class);
		idea.dtatypesim();
		idea.typeofsim();
		idea.displayStrength();
	}
}
