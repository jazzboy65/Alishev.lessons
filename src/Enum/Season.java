package Enum;

public enum Season {
    WINTER(-30),SPRING(10),SUMMER(30),AUTUMN(15);

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
