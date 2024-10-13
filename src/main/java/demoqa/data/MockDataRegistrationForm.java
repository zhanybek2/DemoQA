package demoqa.data;

import com.github.javafaker.Faker;
import demoqa.entities.TextBox;
import demoqa.entities.WebTables;

public class MockDataRegistrationForm {

    private static Faker faker = new Faker();

    public static String randomFirstName() {
        return faker.name().fullName();

    }

    public static String randomLastName() {
        return faker.name().fullName();
    }

    public static String randomEmail() {
        return faker.internet().emailAddress();
    }

    public static String randomAddress() {
        return faker.address().fullAddress();

    }

    public static int randomAge() {
        return faker.number().numberBetween(18, 100); // Возраст от 18 до 99
    }


    public static int randomSalary() {
        return faker.number().numberBetween(30000, 150000); // Зарплата от 30,000 до 150,000
    }

    public static String randomDepartment() {
        return faker.company().bs();
    }

    public static WebTables randomRegistration() {
        String firstName = randomFirstName();
        String lastName = randomLastName();
        String email = randomEmail();
        Integer age = Integer.valueOf(randomAge());
        Integer salary = Integer.valueOf(randomSalary());
        String department = randomDepartment();
        WebTables webTables = new WebTables(firstName, lastName, email, age, salary, department);
        return webTables;
    }
}




