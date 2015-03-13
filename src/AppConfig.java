import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bdgolka.repository.CustomerRepository;
import com.bdgolka.repository.HibernateCustomerRepositoryImpl;
import com.bdgolka.service.CustomerService;
import com.bdgolka.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.bdgolka"})
public class AppConfig {

	@Bean(name="customerService")
	public CustomerService getCustomerServise(){
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerReposoitory(getCustomerRepository());
		
		return customerService;
	}
	
	/*@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}*/
}
