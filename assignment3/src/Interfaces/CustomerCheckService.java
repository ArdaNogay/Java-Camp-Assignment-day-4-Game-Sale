package Interfaces;
import Entities.Customer;

public abstract class CustomerCheckService {
	public abstract boolean checkIfRealPerson(Customer customer);

}
