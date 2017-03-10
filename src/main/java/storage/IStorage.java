package storage;

import java.util.Map;

/**
 * Created by Vova on 09.03.2017.
 */
public interface IStorage<K, E> {

    K add(E entity);

    E get(K key);

    Map<K, E> all();

    E update(K key, E entity);

    E remove(K key);


}
