package Enum;

public enum Viking {
    RAT("крыса"),HORSE("лошадь"), BEAR("медвель");
    //Эквивалентно new RAT("крыса")

    private final String translation;

    Viking(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
