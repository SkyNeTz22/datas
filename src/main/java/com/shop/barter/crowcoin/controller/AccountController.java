package com.shop.barter.crowcoin.controller;

import com.shop.barter.crowcoin.entities.Account;
import com.shop.barter.crowcoin.entities.Character;
import com.shop.barter.crowcoin.repository.AccountInterface;
import com.shop.barter.crowcoin.repository.CharacterInterface;
/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController
    {
    private final AccountInterface accountInterface;

    private final CharacterInterface characterInterface;

        public AccountController(AccountInterface accountInterface, CharacterInterface characterInterface) {
            this.accountInterface = accountInterface;
            this.characterInterface = characterInterface;
        }


        @GetMapping("/getallchars")
        public List<Character> getAllCharacters(){
            return new ArrayList<>(characterInterface.findAll());
        }

        @GetMapping("/getallacc")
    public List<Account> getAllAccounts()
    {
        return new ArrayList<>(accountInterface.findAll());
    }

    @PostMapping("/addacc")
    public Account addAccount(@RequestBody Account account)
    {
        return accountInterface.save(account);
    }

    @GetMapping("/findbyid/{id}")
    public Account findId(@PathVariable Long id)
    {
        return accountInterface.findById(id).get();
    }

    @DeleteMapping("/deleteall/{id}")
    public Account removeAccount(@PathVariable Long id) {
        Optional<Account> findbyid = accountInterface.findById(id);

        if (findbyid.isPresent()) {
            accountInterface.deleteById(id);
        }

        return null;
    }
    



}
