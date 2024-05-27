package sberTasks;
import java.util.Collection;

/**
 * Интерфейс для получения данных студентов
 */
public interface Greeting {

    /**
     * Получение имени.
     */
    String getFirstName();

    /**
     * Получение фамилии.
     */
    String getLastName();

    /**
     * Получение года рождения.
     */
    int getBirthYear();

    /**
     * Получение набора хобби.
     */
    Collection<String> getHobbies();

    /**
     * Получение имени репозитория.
     */
    String getRepoUrl();

    /**
     * Получение телефона.
     */
    String getPhone();

    /**
     * Получение набора ожиданий от курса.
     */
    Collection<String> getCourseExpectations();
}
