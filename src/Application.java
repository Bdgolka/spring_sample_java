import com.bdgolka.service.CustomerServiceImpl;
import com.bdgolka.service.CustomerSetvice;

public class Application {

	public static void main(String[] args) {
		CustomerSetvice service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstmname());
	}
}
