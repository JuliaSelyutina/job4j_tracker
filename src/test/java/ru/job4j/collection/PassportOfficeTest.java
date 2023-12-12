package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddDuplicateCitizen() {
        PassportOffice office = new PassportOffice();
        Citizen citizen = new Citizen("bcd34567", "Alex Alexeev");
        Citizen citizenDuplicateByPassport = new Citizen("bcd34567", "Marina Alexeeva");
        office.add(citizen);
        assertThat(office.add(citizenDuplicateByPassport)).isFalse();
    }

    @Test
    public void whenTestGetByNotAddedPassportIsNull() {
        PassportOffice office = new PassportOffice();
        Citizen citizen = new Citizen("345689a", "Ivan Ivanov");
        Citizen citizen2 = new Citizen("000000b", "Ivan Ivanov");
        office.add(citizen2);
        assertThat(office.get("345689a")).isNull();
    }
}
