package Managers;


import Entities.Customer;
import Interfaces.CustomerCheckService;

public class CustomerCheckMaganer extends CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		if(customer.getId()==1 && customer.getFirstName()=="Arda"&& customer.getLastName()=="Nogay" && 
				customer.getDateOfBirth()== 1985  && customer.getNationalityID()=="155550"){
			
			System.out.println("Kiþi Bilgileri Doðrulandý!");
			return true;
		}
		else {
			System.out.println("Not a valid person!");
			return false;
		}
		
	}

}
