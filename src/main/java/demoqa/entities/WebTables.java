package demoqa.entities;

import lombok.Getter;

import java.util.Objects;

@Getter
public class WebTables {
    private String firstName;
    private String lastName;
    private String email;
    private int age ;
    private int salary;
    private String department;

    public WebTables(String firstName, String lastName, String email, int age, int salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebTables webTables = (WebTables) o;
        return age == webTables.age && salary == webTables.salary && Objects.equals(firstName, webTables.firstName) && Objects.equals(lastName, webTables.lastName) && Objects.equals(email, webTables.email) && Objects.equals(department, webTables.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, salary, department);
    }
}
