package nLayeredApp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredApp.entities.concretes.CorporateCustomer;

public interface CorporateCustomerDao {
	void add(CorporateCustomer corporateCustomer);
	void update(CorporateCustomer corporateCustomer);
	void delete(CorporateCustomer corporateCustomer);
	List<CorporateCustomer> getAll();
	
	
	/*List<CorporateCustomer> customers;

	
	public CorporateCustomerDao() {
		customers = new ArrayList<CorporateCustomer>();
	}

	public void add(CorporateCustomer customer) {
		customers.add(customer);
	}
	
	public void delete(CorporateCustomer customer) {
		customers.remove(customer);
	}
	
	public void update(CorporateCustomer customer) {
		
	}
	public List<CorporateCustomer> getAll() {
		return customers;
	}
*/
}
