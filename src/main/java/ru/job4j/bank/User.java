package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает работу пмодель пользователя банка.
 * @author Julia Selyutina
 * @version 1.0
 */
public class User {
    private String passport;
    private String username;

    /**
     * Метод создает пользователя (владельца) банковского счета.
     * @param passport номер паспорта.
     * @param username ФИО.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получить данные о паспорте.
     * @return возвращает номер паспорта.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяет установить номер паспорта.
     * @param passport номер паспорта.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получить данные о ФИО.
     * @return возвращает ФИО.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод позволяет установить значение ФИО.
     * @param username значение ФИО.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
