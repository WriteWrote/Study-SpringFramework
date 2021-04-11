package ru.ellinaobukhova.springcourse;

public class DubstepMusic implements Music {
    @Override
    public String getSong() {
        return "Dubstep for Pussies";
    }

    private void init() {
        System.out.println("Initialise Dubstep Music file");
    }

    private void destroy() {
        System.out.println("Destroing Dubstep Music file");
    }
}
