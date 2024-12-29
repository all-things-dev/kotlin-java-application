import dev.all_things.playground.model.Customer
import org.apache.logging.log4j.LogManager

public class CustomerService
{
	private val logger = LogManager.getLogger(CustomerService::class.java)

	fun getCustomer(id: Int): Customer
	{
		return Customer("Thomas", "Anderson");
	}
}