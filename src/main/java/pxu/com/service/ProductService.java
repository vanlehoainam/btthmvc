package pxu.com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import pxu.com.model.Product;

public interface ProductService {
	List<Product> fimAll();

	Product finByid(int code);

	void save(Product product);

	void update(Product product); 

	void delete(int code);
}
