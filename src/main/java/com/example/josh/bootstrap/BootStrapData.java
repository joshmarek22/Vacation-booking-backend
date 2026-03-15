package com.example.josh.bootstrap;

import com.example.josh.entities.Customer;
import com.example.josh.dao.CustomerRepository;
import com.example.josh.dao.DivisionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args){
        if(customerRepository.count() <= 1){
            Customer customer1 = new Customer();
            customer1.setFirstName("Super");
            customer1.setLastName("Man");
            customer1.setPostal_code("12345");
            customer1.setAddress("222 Street");
            customer1.setPhone("(614)555-1234");
            customer1.setDivision(divisionRepository.findAll().get(7));
            customer1.setCreate_date(new Date());
            customer1.setLast_update(new Date());

            Customer customer2 = new Customer();
            customer2.setFirstName("Bruce");
            customer2.setLastName("Wayne");
            customer2.setPostal_code("54321");
            customer2.setAddress("456 Bat Cave");
            customer2.setPhone("(614)555-5678");
            customer2.setDivision(divisionRepository.findAll().get(3));
            customer2.setCreate_date(new Date());
            customer2.setLast_update(new Date());

            Customer customer3 = new Customer();
            customer3.setFirstName("Peter");
            customer3.setLastName("Parker");
            customer3.setPostal_code("67890");
            customer3.setAddress("789 Pine Street");
            customer3.setPhone("(614)555-9012");
            customer3.setDivision(divisionRepository.findAll().get(5));
            customer3.setCreate_date(new Date());
            customer3.setLast_update(new Date());

            Customer customer4 = new Customer();
            customer4.setFirstName("Tony");
            customer4.setLastName("Stark");
            customer4.setPostal_code("98765");
            customer4.setAddress("101 Elm Road");
            customer4.setPhone("(614)555-3456");
            customer4.setDivision(divisionRepository.findAll().get(2));
            customer4.setCreate_date(new Date());
            customer4.setLast_update(new Date());

            Customer customer5 = new Customer();
            customer5.setFirstName("Steve");
            customer5.setLastName("Rogers");
            customer5.setPostal_code("11223");
            customer5.setAddress("202 Cedar Lane");
            customer5.setPhone("(614)555-7890");
            customer5.setDivision(divisionRepository.findAll().get(4));
            customer5.setCreate_date(new Date());
            customer5.setLast_update(new Date());

            // Save all customers at once
            customerRepository.saveAll(java.util.List.of(customer1, customer2, customer3, customer4, customer5));
            System.out.println("Sample customers added!");
        } else {
            System.out.println("Customers already exist, skipping sample data.");
        }
    }

}
