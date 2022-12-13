package Lab6.Lab6_2;

public class Collection<T> {
    private T[] collection;

    public Collection(T[] collection) {
        this.collection = collection;
    }

    public T[] getCollection() {
        return collection;
    }

    public void setCollection(T[] collection) {
        this.collection = collection;
    }
}
