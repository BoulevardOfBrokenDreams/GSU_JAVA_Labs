package Lab3;

public enum TypeOfEducation {
    ELEMENTARY("Начальная школа"),
    SECONDARY("Средняя школа"),
    TECHNICAL("Техникум"),
    UNIVERSITY("Университет");

    private final String Title;

    TypeOfEducation(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

}
