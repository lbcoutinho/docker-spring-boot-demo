package br.com.lbcoutinho.demodockerapi.controller;

import br.com.lbcoutinho.demodockerapi.model.Customer;
import br.com.lbcoutinho.demodockerapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAll() {
        return newArrayList(customerRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getById(@PathVariable Long id) {
        Optional<Customer> result = customerRepository.findById(id);
        if (result.isPresent())
            return ResponseEntity.ok(result.get());
        else return ResponseEntity.notFound().build();
    }

}
