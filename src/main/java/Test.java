import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.app.dao.IProductDAO;
import com.mtc.app.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		IProductDAO productDAO=applicationContext.getBean("productDAO", IProductDAO.class);
		Product product = new Product(110,"Mouse","Logitech",20000);
		productDAO.addProduct(product);;
//		Product product = productDAO.getproductById(106);
//		System.out.println("ProductId:"+ product.getId());
//		System.out.println("ProductName:"+ product.getName());
//		System.out.println("ProductDescription:"+ product.getDescription());
//		System.out.println("ProductPrice:"+ product.getPrice());
//		System.out.println();
	}
	

}
