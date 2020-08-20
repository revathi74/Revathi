/*package com.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dal.ProductsEntity;
import com.dal.ProductsRespository;
import com.dal.registerEntity;*/

/*@Service
public class ProductsBean {
	@Autowired
	public ProductsRespository PR;
*/
	/*public String displayProducts(String name, String price) {
		List<ProductsEntity> results = PR.findByname(name);

		try {
			if (results.size() == 0) {
				ProductsEntity newPB = new ProductsEntity();
				PR.save(newPB);
			return "success";
			}
			else{
				
			return "error";
			}
			
			ProductsEntity newPE = new ProductsEntity(name,price);
			PR.save(newPE);
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*return "error";

	}*/
	////
/*public String saveProduct(ProductsEntity re) {
		
		ProductsEntity product=new ProductsEntity();
/product.setName(name);
	product.setPrice(price);
	PR.save(re);
	    product.setName(re.getName());
	    product.setPrice(re.getPrice());
	
		if(!re.equals(null)) {
			PR.save(product);
			return "success";
			
		}else
		return " Error";
	}
	*/

/*public String saveProduct(String name, String price ) {
		
		ProductsBean product=new ProductsBean();
		((Object) product).setName(name);
		product.setPrice(price);
		ProductsBean p=PR.save(product);
		if(p!=null) {
			return "success";
			
	}else
	return "";
}
private void setPrice(String price) {
	// TODO Auto-generated method stub
	
}

  */ 



