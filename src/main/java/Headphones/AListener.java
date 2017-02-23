package headphones;

/**
 * Created by Vova on 14.02.2017.
 */
public interface AListener<Thing> {
    void addListener(Thing listener);
    void removeListener(Thing listener);
}
