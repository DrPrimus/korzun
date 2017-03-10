package headphones;

import primus.IHeadphonesDAO;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Реализация слоя доступа к хранилищу наушников
 * Created by v.hovanski on 02.03.2017.
 */
public class HeadphonesDAO implements IHeadphonesDAO {
    private static IHeadphonesDAO INSTANCE;

    private Map<UUID, Headphones> storage;

    private HeadphonesDAO() {
        storage = new HashMap<>();
    }

    public static synchronized IHeadphonesDAO getINSTANCE() {
        if (INSTANCE == null)
            INSTANCE = new HeadphonesDAO();

        return INSTANCE;
    }
    public UUID add(Headphones value) {
        UUID key = UUID.randomUUID();
        storage.put(key, value);
        return key;
    }

    @Override
    public Map<UUID, Headphones> list() {
        return storage;
    }
    @Override
    public Headphones one(UUID key) {
        return storage.get(key);
    }
    @Override
    public Headphones update(UUID key, Headphones entity){
        return storage.put(key,entity);
    }
    @Override
    public Headphones remove(UUID key){
        return storage.remove(key);
    }
}
//TODO Написать реализацию интерфейса хранилища наушников. В качестве ключа - строковое представление UUID

