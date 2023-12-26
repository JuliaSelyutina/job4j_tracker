package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(String passport) {
        User user = findByPassport(passport);
        users.remove(user);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        boolean accountContains;
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            accountContains = accounts.contains(account);
            if (!accountContains) {
                users.get(user).add(account);
            }
        }

    }

    public User findByPassport(String passport) {
        Set<User> allUsers = users.keySet();
        for (User user : allUsers) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        List<Account> accounts = getAccounts(user);
        for (Account account : accounts) {
            if (account.getRequisite().equals(requisite)) {
                return account;
            }
        }
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account accountSource = findByRequisite(sourcePassport, sourceRequisite);
        Account accountDestination = findByRequisite(destinationPassport, destinationRequisite);
        if (accountSource == null || accountDestination == null) {
            return result;
        }
        if (accountSource.getBalance() < amount) {
            return result;
        }
        accountSource.setBalance(accountSource.getBalance() - amount);
        accountDestination.setBalance(accountDestination.getBalance() + amount);
        result = true;
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
