package sberTasks;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class GreetingImplTest {

    @Test
    public void testGetFirstName() {
        Greeting greeting = new GreetingImpl();
        Assert.assertEquals("Dmitry", greeting.getFirstName());
    }

    @Test
    public void testGetLastName() {
        Greeting greeting = new GreetingImpl();
        Assert.assertEquals("Malkov", greeting.getLastName());
    }

    @Test
    public void testGetBirthYear() {
        Greeting greeting = new GreetingImpl();
        Assert.assertEquals(2003, greeting.getBirthYear());
    }

    @Test
    public void testGetHobbies() {
        Greeting greeting = new GreetingImpl();
        Collection<String> expectedHobbies = Arrays.asList("Programming", "Sport");
        Assert.assertEquals(expectedHobbies, greeting.getHobbies());
    }

    @Test
    public void testGetRepoUrl() {
        Greeting greeting = new GreetingImpl();
        Assert.assertEquals("https://github.com/DmitryMalkov777/SberTaskJavaSchool1", greeting.getRepoUrl());
    }

    @Test
    public void testGetPhone() {
        Greeting greeting = new GreetingImpl();
        Assert.assertEquals("+77777777777", greeting.getPhone());
    }

    @Test
    public void testGetCourseExpectations() {
        Greeting greeting = new GreetingImpl();
        Collection<String> expectedExpectations = Arrays.asList("Получить новые знания", "Развить навыки программирования", "Познакомиться с интересными людьми");
        Assert.assertEquals(expectedExpectations, greeting.getCourseExpectations());
    }
}
