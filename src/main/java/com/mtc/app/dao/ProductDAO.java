package com.mtc.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mtc.app.entity.Product;

@Repository
public class ProductDAO implements IProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation=Propagation.REQUIRED,timeout=60)
	public void addProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.getTransaction();
//		transaction.begin();
//			session.save(product);
//		transaction.commit();
//	session.close();
	}

	public Product getproductById(int id) {
		Session session = sessionFactory.openSession();
		Product product = (Product)session.get(Product.class, id);
		return product;
	}

	public List<Product> getproducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Float getMaxPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addProducts(List<Product> products) {
		// TODO Auto-generated method stub
		
	}

}
