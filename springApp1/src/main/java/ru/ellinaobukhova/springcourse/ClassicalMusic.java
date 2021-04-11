package ru.ellinaobukhova.springcourse;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical Music Song";
    }

    private void init() {
        System.out.println("Initialise Classical Music file");
    }

    private void destroy() {
        System.out.println("Destroing Classical Music file");
    }
}
