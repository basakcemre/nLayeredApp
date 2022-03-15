package nLayeredApp.api;

import nLayeredApp.business.concretes.CorporateCustomerManager;
import nLayeredApp.business.concretes.IndividualCustomerManager;
import nLayeredApp.dataAccess.concretes.HibernateIndividualCustomerDao;
import nLayeredApp.dataAccess.concretes.JdbcCorporateCustomerDao;
import nLayeredApp.entities.concretes.CorporateCustomer;
import nLayeredApp.entities.concretes.IndividualCustomer;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager(new HibernateIndividualCustomerDao());
		individualCustomerManager.add(new IndividualCustomer(1,"12345","Engin","Demiroğ","12345678910"));
		CorporateCustomerManager corporateCustomerManager = new CorporateCustomerManager(new JdbcCorporateCustomerDao());
		corporateCustomerManager.add(new CorporateCustomer(2,"67890","Başak","Karaca"));
	
		
		/*IndividualCustomer customer1 = new IndividualCustomer(1,"12345","Engin","Demiroğ","12345678910");
		IndividualCustomer customer2 = new IndividualCustomer(2,"67890","Başak","Karaca","12345678911");
		
		IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager();
		individualCustomerManager.add(customer1);
		individualCustomerManager.add(customer2);
		
		for(IndividualCustomer customer : individualCustomerManager.getAll()) {
		System.out.println(customer.getFirstName());
	}
	}*/
}
}