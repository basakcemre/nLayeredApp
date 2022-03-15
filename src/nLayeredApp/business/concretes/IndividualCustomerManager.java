package nLayeredApp.business.concretes;

import java.util.List;

import nLayeredApp.dataAccess.concretes.IndividualCustomerDao;
import nLayeredApp.entities.concretes.IndividualCustomer;

public class IndividualCustomerManager {
	
	private IndividualCustomerDao individualCustomerDao;
	public IndividualCustomerManager(IndividualCustomerDao individualCustomerDao) {
		this.individualCustomerDao = individualCustomerDao;
	}
	
	public void add(IndividualCustomer customer) {
		individualCustomerDao.add(customer);
	}

}

//Bir e ticaret sistemi yazmak istiyoruz
//Katmanlı mimari kullanacağız
//Katmanları oluşturunuz
//Ürün ekleme, silme, listeleme operasyonlarını yazınız
//Ürün eklenirken daha önce o ürün ismi eklenmişse, ekleme gerçekleşmemeli