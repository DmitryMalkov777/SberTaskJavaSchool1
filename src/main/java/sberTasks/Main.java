package sberTasks;

public class Main {
    public static void main(String[] args) {
        GreetingImpl man = new GreetingImpl();
        System.out.println(man.getFirstName());
        System.out.println(man.getLastName());
        System.out.println(man.getBirthYear());
        System.out.println(man.getCourseExpectations());
        System.out.println(man.getHobbies());
        System.out.println(man.getPhone());
        System.out.println(man.getRepoUrl());
    }
}
