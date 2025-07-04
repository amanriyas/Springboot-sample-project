package com.example.nobsv2.mappings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    // Define methods specific to Customer repository operations
    // For example:
    // Customer findByEmail(String email);
    // List<Customer> findByLastName(String lastName);
    // void deleteById(Integer id);

    // Additional methods can be added as needed
}
