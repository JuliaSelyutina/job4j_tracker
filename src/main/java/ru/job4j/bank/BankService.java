package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковского сервиса.
 * @author Julia Selyutina
 * @version 1.0
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет владельца банковского счета.
     * @param user владелец банковского счета.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет владельца банковского счета.
     * @param passport паспорт владельца банковского счета.
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод создает новый банковский счет.
     * @param passport паспорт владельца банковского счета.
     * @param account банковский счет, который будет создан и привязан к владельцу паспорта.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }

    }

    /**
     * Метод выполняет поиск владельца банковского счета попаспорту.
     * @param passport паспорт владельца банковского счета.
     * @return возвращает владельца банковского счета.
     */
    public User findByPassport(String passport) {
        Set<User> allUsers = users.keySet();
        for (User user : allUsers) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод выполняет поиск банковского счета по паспорту владельца счета и реквизитам банковского счета.
     * @param passport паспорт владельца банковского счета.
     * @param requisite реквизиты банковского счета.
     * @return возврвщает банковский счет.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит деньги с одного банковского счета надругой.
     * Если счёт не найден или не хватает денег на счёте, с которого переводят, то операция перевода не будет выполнена.
     * @param sourcePassport паспорт владельца банковского счета, с которого переводят.
     * @param sourceRequisite реквизиты банковского счета, с которого переводят.
     * @param destinationPassport паспорт владельца банковского счета, на который переводят.
     * @param destinationRequisite реквизиты банковского счета, на который переводят.
     * @param amount сумма перевода.
     * @return возвращает результат выполнения операции - true, если перевод выполнен и false, если нет.
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account accountSource = findByRequisite(sourcePassport, sourceRequisite);
        Account accountDestination = findByRequisite(destinationPassport, destinationRequisite);
        if (accountSource == null || accountDestination == null || accountSource.getBalance() < amount) {
            return false;
        }
        accountSource.setBalance(accountSource.getBalance() - amount);
        accountDestination.setBalance(accountDestination.getBalance() + amount);
        return true;
    }

    /**
     * Метод возвращает список всех счетов, которыми владеет пользователь.
     * @param user пользователь (владелец банковских счетов).
     * @return возвращает спиок всех счетов пользователя.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
