package ma.chakir.digitalBanking.repositories;



import ma.chakir.digitalBanking.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}