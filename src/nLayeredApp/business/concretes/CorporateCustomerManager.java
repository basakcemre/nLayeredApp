package nLayeredApp.business.concretes;

import java.util.List;

import nLayeredApp.dataAccess.concretes.CorporateCustomerDao;
import nLayeredApp.entities.concretes.CorporateCustomer;

public class CorporateCustomerManager {
	
	private CorporateCustomerDao corporateCustomerDao;
	public CorporateCustomerManager(CorporateCustomerDao corporateCustomerDao) {
		this.corporateCustomerDao = corporateCustomerDao;
	}
	
	public void add(CorporateCustomer customer) {
		corporateCustomerDao.add(customer);
	}


}
