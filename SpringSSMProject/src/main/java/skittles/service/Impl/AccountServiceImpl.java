package skittles.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skittles.dao.AccountDao;
import skittles.domain.Account;
import skittles.service.AccountService;

import javax.naming.Name;
import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;
    @Override
    public Account findByName(String name) throws Exception {
        return accountDao.findByName(name);
    }

    @Override
    public void save(Account account) {
            accountDao.save(account);
    }
}
