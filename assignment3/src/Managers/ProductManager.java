package Managers;

import Entities.Product;
import Interfaces.ProductService;

public class ProductManager implements ProductService{
	

	@Override
	public void add(Product product) {
		System.out.println("'"+product.getProductName()+"'"+" adlý ürünün "+ product.getProductPrice() +" TL fiyatýyla sisteme eklendi!");
	}

	@Override
	public void delete(Product product) {
		System.out.println("'"+product.getProductName()+"'"+" adlý ürün silindi"+" Ýade edilcek tutar : "+product.getProductPrice()+" TL");
	}

	@Override
	public void update(Product product) {
		System.out.println("Ürün baþarýyla güncellendi. "+"  Güncel ismi: "+product.getProductName()+ " --> Güncel fiyat : "+product.getProductPrice()+" TL");

	}

}
