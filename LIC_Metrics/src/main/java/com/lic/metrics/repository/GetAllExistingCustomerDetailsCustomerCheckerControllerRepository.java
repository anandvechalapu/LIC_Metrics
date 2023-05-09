import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.metrics.repository.model.Customer;

public interface GetAllExistingCustomerDetailsCustomerCheckerControllerRepository extends JpaRepository<Customer, Long> {
    Customer findByCustomerId(Long customerId);
}