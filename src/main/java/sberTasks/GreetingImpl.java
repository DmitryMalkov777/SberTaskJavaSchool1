package sberTasks;

import java.util.Arrays;
import java.util.Collection;

public class GreetingImpl implements Greeting{
    /**
     * Имя пользователя.
     */
    private final String firstName;

    /**
     * Фамилия пользователя.
     */
    private final String lastName;

    /**
     * Год рождения пользователя.
     */
    private final int birthYear;

    /**
     * Список хобби пользователя.
     */
    private Collection<String> hobbies;

    /**
     * URL репозитория пользователя.
     */
    private String repoUrl;

    /**
     * Номер телефона пользователя.
     */
    private String phone;

    /**
     * Список ожиданий от курса.
     */
    private Collection<String> courseExpectations;

    /**
     * Конструктор класса GreetingImpl.
     */
    public GreetingImpl() {
        this.firstName = "Dmitry";
        this.lastName = "Malkov";
        this.birthYear = 2003;
        this.hobbies = Arrays.asList("Programming", "Sport");
        this.repoUrl = "https://github.com/DmitryMalkov777/SberTaskJavaSchool1";
        this.phone = "+77777777777";
        this.courseExpectations = Arrays.asList("Получить новые знания", "Развить навыки программирования", "Познакомиться с интересными людьми");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getHobbies() {
        return hobbies;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRepoUrl() {
        return repoUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPhone() {
        return phone;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return courseExpectations;
    }
}
