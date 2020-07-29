package com.shop.barter.crowcoin.repository;


import com.shop.barter.crowcoin.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountInterface extends JpaRepository<Account, Long> {

}
