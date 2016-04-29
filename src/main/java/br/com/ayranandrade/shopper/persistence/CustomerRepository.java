package br.com.ayranandrade.shopper.persistence;

import br.com.ayranandrade.shopper.model.Customer;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ayran
 */
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {}