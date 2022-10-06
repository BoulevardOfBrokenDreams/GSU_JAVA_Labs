package Lab3;

import java.util.Scanner;

public enum District {
    SOVIET("Советский"),
    CENTRAL("Центральный"),
    NEWBELICA("Новобелицкий"),
    RAILWAY("Железнодорожный"),
    DEFAULT("");

    private String title;

    District(Scanner scanner){
        this.setTitle(scanner);
    }

    District(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setTitle(Scanner scanner){
        System.out.println("Enter number of district:\n1 Soviet\n2 Central\n3Newbelica\n4Railway");
        switch (scanner.nextInt()){
            case 1 -> this.title = SOVIET.getTitle();
            case 2 -> this.title = CENTRAL.getTitle();
            case 3 -> this.title = NEWBELICA.getTitle();
            case 4 -> this.title = RAILWAY.getTitle();
            default -> this.title = DEFAULT.getTitle();
        }
    }
}
