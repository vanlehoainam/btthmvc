package pxu.com.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pxu.com.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	private static final Map<Integer, Product> products;

	static {
		products = new HashMap<Integer, Product>();
		products.put(1, new Product(1, "Iphone1", 10999000));
		products.put(2, new Product(2, "Iphone2", 10299000));
		products.put(3, new Product(3, "Iphone3", 10399000));
		products.put(4, new Product(4, "Iphone4", 10499000));
		products.put(5, new Product(5, "Iphone5", 10599000));
	}

	@Override
	public List<Product> fimAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Product>(products.values());
	}

	@Override
	public Product finByid(int code) {
		// TODO Auto-generated method stub
		Product product = products.get(code);
		return product;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		products.put(product.getCode(), product);
	}

	@Override
	public void delete(int code) {
		products.remove(code);
	}

	@Override
	public void update(Product product) {
		int productId = product.getCode();
		if (products.containsKey(productId)) {
			products.put(productId, product);
		}
	}

}
