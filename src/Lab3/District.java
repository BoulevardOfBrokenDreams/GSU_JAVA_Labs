package Lab3;

public enum District {
    SOVIET("Советский"),
    CENTRAL("Центральный"),
    NEWBELICA("Новобелицкий"),
    RAILWAY("Железнодорожный");

    private final String title;

    District(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
