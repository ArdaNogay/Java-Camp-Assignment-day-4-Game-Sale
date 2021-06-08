package Interfaces;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;


public interface SaleService {
	void add(Customer customer,Product product,Campaign campaign);
}
