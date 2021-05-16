package kr.co.shopping_mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.shopping_mall.dao.ProductDao;
import kr.co.shopping_mall.model.Product;
import kr.co.shopping_mall.model.ProductInfo;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;
	public List<Product> readAll() {
		return dao.readAllProduct();
	}
	public List<ProductInfo> readAllInfo() {
		return dao.readAllProductInfo();
	}
	public int add(Product product) {
		return dao.addProduct(product);
	}
	public int update(Product product) {
		return dao.updateProduct(product);
	}
	public int delete(int productId) {
		return dao.deleteProduct(productId);
	}
}
