import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.metrics.entity.ClaimMbr;

public interface GetBatchAssociateDataRepository extends JpaRepository<ClaimMbr, Integer> {

// This method will retrieve the associated claims data based on the master policy number
    List<ClaimMbr> findByMasterPolicyNo(String masterPolicyNo);
}