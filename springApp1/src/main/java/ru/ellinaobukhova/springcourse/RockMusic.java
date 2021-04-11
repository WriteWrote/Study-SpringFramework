package ru.ellinaobukhova.springcourse;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock Music Song";
    }

    private void init() {
        System.out.println("Initialise Rock Music file");
    }

    private void destroy() {
        System.out.println("Destroing Rock Music file");
    }
}
