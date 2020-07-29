package repository;

import com.shop.barter.crowncoin.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountInterface extends JpaRepository<Account, Long> {

}
