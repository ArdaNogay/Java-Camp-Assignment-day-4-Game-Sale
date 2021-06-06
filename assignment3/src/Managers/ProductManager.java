package Managers;

import Entities.Product;
import Interfaces.ProductService;

public class ProductManager implements ProductService{
	

	@Override
	public void add(Product product) {
		System.out.println("'"+product.getProductName()+"'"+" adl� �r�n�n "+ product.getProductPrice() +" TL fiyat�yla sisteme eklendi!");
	}

	@Override
	public void delete(Product product) {
		System.out.println("'"+product.getProductName()+"'"+" adl� �r�n silindi"+" �ade edilcek tutar : "+product.getProductPrice()+" TL");
	}

	@Override
	public void update(Product product) {
		System.out.println("�r�n ba�ar�yla g�ncellendi. "+"  G�ncel ismi: "+product.getProductName()+ " --> G�ncel fiyat : "+product.getProductPrice()+" TL");

	}

}
