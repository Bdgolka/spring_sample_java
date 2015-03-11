import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bdgolka.service.CustomerService;
import com.bdgolka.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		
		//CustomerService service = new CustomerServiceImpl();
			

		System.out.println(service.findAll().get(0).getFirstmname());

	}
}
