package Managers;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;
import Interfaces.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void add(Customer customer, Product product, Campaign campaign) {
		System.out.println("'"+product.getProductName()+"'"+ " isimli �r�n�n sat��� "+" >> "+product.getProductPrice()+"TL fiyat�yla "+"'"+ campaign.getCampaignName()+"'"+" kampanyas�ndan yaralarak ba�ar�yla ger�ekle�mi�tir. �yi g�nlerde kullan�n Say�n : "+customer.getFirstName()+" "+customer.getLastName() );

		
	}
}
