package assignment3;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;
import Entities.Sale;
import Managers.CampaignManager;
import Managers.CustomerCheckMaganer;
import Managers.CustomerManager;
import Managers.ProductManager;
import Managers.SaleManager;
public class Main {

	public static void main(String[] args) {
		
		//Customer(1, "Arda", "Nogay", 1985, "155550") doðru bilgiler olacaktýr.
		
		Customer customer1 = new Customer(1, "Arda", "Nogay", 1985, "155550");
		CustomerManager customerManager = new CustomerManager(new CustomerCheckMaganer());
		customerManager.add(customer1);
		customerManager.delete(customer1);
		customerManager.update(customer1);
		
		
		System.out.println("------------");
		Product game1 = new Product("Assasins Creed", 150);
		ProductManager productManager = new ProductManager();
		productManager.add(game1);
		productManager.delete(game1);
		productManager.update(game1);


		System.out.println("------------");
		Campaign campaign1 = new Campaign("Yaz fýrsatlarý", 20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		
		System.out.println("------------");
		Sale sale1 = new Sale("Satýþ");
		SaleManager saleManager = new SaleManager(customer1, game1, campaign1);
		saleManager.add(sale1);
		saleManager.delete(sale1);
		
		
	}

}
