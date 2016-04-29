package br.com.ayranandrade.persistence;

import br.com.ayranandrade.model.Customer;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ayran
 */
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {}