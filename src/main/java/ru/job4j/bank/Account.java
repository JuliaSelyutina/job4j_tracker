package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает работу модели банковского счета.
 * @author Julia Selyutina
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     * Метод создает банковский счет. Он принимает на вход реквизиты и баланс.
     * @param requisite реквизиты банковского счета.
     * @param balance баланс банковского счета.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить реквизыты банковского счета.
     * @return возвращает значение реквизитов банковского счета.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод позволяет установить значение реквизитов банковского счета.
     * @param requisite реквизыты банковского счета.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить баланс банковского счета.
     * @return возвращает значение баланса банковского счета.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод позволяет установить значение баланса банковского счета.
     * @param balance баланс банковского счета.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
