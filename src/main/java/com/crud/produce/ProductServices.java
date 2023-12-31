package com.crud.produce;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServices {
	
	@Autowired
	 private ProductRepository repo;
     
	    public List<Product> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Product product) {
	        repo.save(product);
	    }
	     
	    public Product get(int id) {
	        return repo.findById((long) id).get();
	    }
	     
	    public void delete(int id) {
	        repo.deleteById((long) id);
	    }
}
