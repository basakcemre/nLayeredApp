package nLayeredApp.dataAccess.concretes;

import java.util.List;

import nLayeredApp.entities.concretes.IndividualCustomer;

public class JdbcIndividualCustomerDao implements IndividualCustomerDao {

	@Override
	public void add(IndividualCustomer individualCustomer) {
		System.out.println(individualCustomer.getFirstName()+ ": Jdbc ile eklendi");
		
	}

	@Override
	public void update(IndividualCustomer individualCustomer) {
		System.out.println(individualCustomer.getFirstName()+ ": Jdbc ile eklendi");
		
	}

	@Override
	public void delete(IndividualCustomer individualCustomer) {
		System.out.println(individualCustomer.getFirstName()+ ": Jdbc ile eklendi");
		
	}

	@Override
	public List<IndividualCustomer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
