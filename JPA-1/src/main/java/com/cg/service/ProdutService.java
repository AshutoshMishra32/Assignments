package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IProductDao;
import com.cg.entity.Product;

@Service
public class ProdutService implements IProductService {

	@Autowired
	IProductDao prod;
	
	@Override
	public void create(Product s) {
		prod.create(s);
		}

	@Override
	public List reterive() {
		return prod.reterive();
	}
	
	@Override
	public Product findById(int id) {

	return	prod.findById(id);
	}

	@Override
	public void delete(int id) {
	
		prod.delete(id);
	}
	
	

}
