package ma.chakir.digitalBanking;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import ma.chakir.digitalBanking.entities.BankAccount;
import ma.chakir.digitalBanking.entities.CurrentAccount;
import ma.chakir.digitalBanking.entities.Customer;
import ma.chakir.digitalBanking.enums.AccountStatus;
import ma.chakir.digitalBanking.repositories.BankAccountRepository;
import ma.chakir.digitalBanking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DigitalBankingBackendApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(DigitalBankingBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer();
        customer.setName("test");
        customer.setEmail("email@test.com");

        customerRepository.save(customer);

    }
}
