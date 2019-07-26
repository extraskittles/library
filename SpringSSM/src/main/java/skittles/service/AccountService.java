package skittles.service;

import skittles.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void save(Account account);
}
