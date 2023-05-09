import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyFundSearch_PolicySearchControllerRepository extends JpaRepository<PolicyFundSearch_PolicySearchController, Long> {

    List<PolicyFundSearch_PolicySearchController> findByProductAndVariantAndTransactionTypeAndTransactionDate(String product, String variant, String transactionType, Date transactionDate);
}