package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        LocalDate dateOfAdmission = LocalDate.of(2021, 8, 15);
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Petrov");
        student.setPatronymic("Ivanovich");
        student.setGroup("3-A");
        student.setDateOfAdmission(dateOfAdmission);
        System.out.println("student: " + student.getSurname() + " " + student.getName() + " " + student.getPatronymic());
        System.out.println("group: " + student.getGroup());
        System.out.println("date of admission: " + student.getDateOfAdmission());
    }
}
