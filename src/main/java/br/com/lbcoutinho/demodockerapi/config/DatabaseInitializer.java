package br.com.lbcoutinho.demodockerapi.config;

import br.com.lbcoutinho.demodockerapi.model.Customer;
import br.com.lbcoutinho.demodockerapi.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) {
        log.info("Starting database initialization...");

        customerRepository.saveAll(Arrays.asList(
                new Customer("Jack", "912341230"),
                new Customer("Chloe", "912341231"),
                new Customer("Kim", "912341232"),
                new Customer("David", "912341233"),
                new Customer("Michelle", "912341234")));
        log.info("Customers inserted = {}", customerRepository.count());

        log.info("Database initialization finished!");
    }
}
