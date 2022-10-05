package Lab3;

public enum Subject {
    MATH("Математика"),
    RUSSIAN("Руский"),
    PHYSICS("Физика"),
    BELORUSSIAN("Белорусский");

    private String title;

    Subject(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
