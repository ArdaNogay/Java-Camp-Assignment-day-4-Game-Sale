package Managers;

import Entities.Customer;
import Interfaces.CustomerService;

public class CustomerManager implements CustomerService {

	CustomerCheckMaganer customerCheckMaganer;

	public CustomerManager(CustomerCheckMaganer customerCheckMaganer) {
		this.customerCheckMaganer = customerCheckMaganer;
	}

	@Override
	public void add(Customer customer) {

		if (customerCheckMaganer.checkIfRealPerson(customer) == true) {

			System.out.println(
					"'" + customer.getFirstName() + " " + customer.getLastName() + "'" + "kiþisi baþarýyla eklendi");
		}

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(
				"'" + customer.getFirstName() + " " + customer.getLastName() + "'" + "kiþisi baþarýyla silindi");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(
				"'" + customer.getFirstName() + " " + customer.getLastName() + "'" + "kiþisi baþarýyla güncellendi");
	}

}
