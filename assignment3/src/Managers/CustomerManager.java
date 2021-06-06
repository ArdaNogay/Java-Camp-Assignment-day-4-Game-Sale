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
					"'" + customer.getFirstName() + " " + customer.getLastName() + "'" + "ki�isi ba�ar�yla eklendi");
		}

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(
				"'" + customer.getFirstName() + " " + customer.getLastName() + "'" + "ki�isi ba�ar�yla silindi");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(
				"'" + customer.getFirstName() + " " + customer.getLastName() + "'" + "ki�isi ba�ar�yla g�ncellendi");
	}

}
