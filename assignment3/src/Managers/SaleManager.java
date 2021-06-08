package Managers;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;
import Interfaces.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void add(Customer customer, Product product, Campaign campaign) {
		System.out.println("'"+product.getProductName()+"'"+ " isimli ürünün satýþý "+" >> "+product.getProductPrice()+"TL fiyatýyla "+"'"+ campaign.getCampaignName()+"'"+" kampanyasýndan yaralarak baþarýyla gerçekleþmiþtir. Ýyi günlerde kullanýn Sayýn : "+customer.getFirstName()+" "+customer.getLastName() );

		
	}
}
