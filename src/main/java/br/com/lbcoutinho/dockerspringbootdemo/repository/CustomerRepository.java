package br.com.lbcoutinho.dockerspringbootdemo.repository;

import br.com.lbcoutinho.dockerspringbootdemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
