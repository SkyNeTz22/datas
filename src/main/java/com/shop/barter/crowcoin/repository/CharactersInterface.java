package com.shop.barter.crowcoin.repository;


import com.shop.barter.crowcoin.entities.CharactersAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactersInterface extends JpaRepository<CharactersAccount, Long>{

}
