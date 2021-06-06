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
		System.out.println("'"+product.getProductName()+"'"+ " isimli �r�n�n "+sale.getSaleName()+"� "+product.getProductPrice()+"TL fiyat�yla "+ campaign.getCampaignName()+" kampanyas�ndan yaralarak ba�ar�yla ger�ekle�mi�tir. �yi g�nlerde kullan�n Say�n : "+customer.getFirstName()+" "+customer.getLastName() );
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("'"+product.getProductName()+"'"+ " isimli �r�n�n iadesi ger�ekle�mi�tir "+ campaign.getCampaignName()+" kampanys�yla birlikte taraf�n�za iade edilecek tutar : "+product.getProductPrice()+" TL "+ "�yi g�nler Say�n : "+customer.getFirstName()+" "+customer.getLastName());

		
	}
	

}
