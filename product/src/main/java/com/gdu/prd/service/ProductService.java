package com.gdu.prd.service;

import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gdu.prd.domain.ProductDTO;

public interface ProductService {
	public void loadProductList(Model model);
	public int addProduct(ProductDTO productDTO);
//	public int addProduct(String prodName, int prodPrice);
	public void loadProduct(int prodNo, Model model);
	
}
