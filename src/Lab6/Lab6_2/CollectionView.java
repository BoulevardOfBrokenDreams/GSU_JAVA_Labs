package Lab6.Lab6_2;

public class CollectionView<T> {

    public void PrintCollection(Collection<T> collection) {
        var array = collection.getCollection();
        int index = 0;
        for(var item : array){
            if(item != null){
                System.out.println("Object[" + index + "]: " + item.toString());
            }
        }
    }
}
