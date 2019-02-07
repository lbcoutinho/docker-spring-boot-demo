package br.com.lbcoutinho.demodockerapi.repository;

import br.com.lbcoutinho.demodockerapi.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
