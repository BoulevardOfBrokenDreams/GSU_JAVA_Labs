package Lab3;

import java.util.Scanner;

public enum Subject {
    MATH("Математика"),
    RUSSIAN("Руский"),
    PHYSICS("Физика"),
    BELORUSSIAN("Белорусский"),
    DEFAULT("");

    private String title;

    Subject(Scanner scanner){
        setTitle(scanner);
    }

    Subject(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle(Scanner scanner){
        System.out.println("Enter number of subject:\n1 Math\n2 Rus\n3 Physics\n4 Bel");
        switch (scanner.nextInt()) {
            case 1 -> this.title = MATH.getTitle();
            case 2 -> this.title = RUSSIAN.getTitle();
            case 3 -> this.title = PHYSICS.getTitle();
            case 4 -> this.title = BELORUSSIAN.getTitle();
            default -> this.title = DEFAULT.getTitle();
        }
    }
}
