package skittles.service;

import skittles.domain.Account;



public interface AccountService {
    Account findByName(String name) throws Exception;
    void save(Account account);
}
