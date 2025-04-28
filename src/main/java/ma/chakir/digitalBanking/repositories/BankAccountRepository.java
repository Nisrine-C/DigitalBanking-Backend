package ma.chakir.digitalBanking.repositories;



import ma.chakir.digitalBanking.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}