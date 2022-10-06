package Lab3;

import java.util.Scanner;

public enum TypeOfEducation {
    ELEMENTARY("Начальная школа"),
    SECONDARY("Средняя школа"),
    TECHNICAL("Техникум"),
    UNIVERSITY("Университет"),
    DEFAULT("");

    private String title;

    TypeOfEducation(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle(Scanner scanner){
        System.out.println("Enter number of type:\n1 Elementary\n2 Secondary\n3 Technical\n4 University");
        switch (scanner.nextInt()){
            case 1 -> this.title = ELEMENTARY.getTitle();
            case 2 -> this.title = SECONDARY.getTitle();
            case 3 -> this.title = TECHNICAL.getTitle();
            case 4 -> this.title = UNIVERSITY.getTitle();
            default -> this.title = DEFAULT.getTitle();
        }
    }
}
