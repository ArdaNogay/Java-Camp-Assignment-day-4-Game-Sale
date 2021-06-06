package Managers;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;
import Entities.Sale;
import Interfaces.SaleService;

public class SaleManager implements SaleService{
	
	Product product;
	Campaign campaign;
	Customer customer;
	
	public SaleManager(Customer customer,Product product,Campaign campaign) {
		this.customer = customer;
		this.campaign = campaign;
		this.product = product;
	}

	
	@Override
	public void add(Sale sale) {
		System.out.println("'"+product.getProductName()+"'"+ " isimli ürünün "+sale.getSaleName()+"ý "+product.getProductPrice()+"TL fiyatýyla "+ campaign.getCampaignName()+" kampanyasýndan yaralarak baþarýyla gerçekleþmiþtir. Ýyi günlerde kullanýn Sayýn : "+customer.getFirstName()+" "+customer.getLastName() );
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("'"+product.getProductName()+"'"+ " isimli ürünün iadesi gerçekleþmiþtir "+ campaign.getCampaignName()+" kampanysýyla birlikte tarafýnýza iade edilecek tutar : "+product.getProductPrice()+" TL "+ "Ýyi günler Sayýn : "+customer.getFirstName()+" "+customer.getLastName());

		
	}
	

}
