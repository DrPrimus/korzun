package headphones;

import primus.IHeadphonesDAO;

import java.util.HashMap;
import java.util.Map;

/**
 * Реализация слоя доступа к хранилищу наушников
 * Created by v.hovanski on 02.03.2017.
 */
public class HeadphonesDAO implements IHeadphonesDAO {
    private static IHeadphonesDAO INSTANCE;

    private HeadphonesDAO() {
        storage = new HashMap<>();
        id = 0;
    }
    private Map<String, Headphones> storage;

    private Integer id;

    public static synchronized IHeadphonesDAO getINSTANCE(IHeadphonesDAO instance){
        if(INSTANCE == null)
            INSTANCE = new HeadphonesDAO();

        return INSTANCE;
    }
    @Override
    public String add(Headphones entity){
        String key = id.toString();
        storage.put(key, entity);
        id++;
        return key;
    }

    @Override
    public Map<String, Headphones> list(){return storage;}
    @Override
    public Headphones one(String key){return storage.remove(key);}

    @Override
    public Headphones update(String key, Headphones entity) {
        storage.put(key, entity);
        return storage.get(key);
    }

    @Override
    public Headphones remove(String key) {return storage.remove(key);}
    }

    //TODO Написать реализацию интерфейса хранилища наушников. В качестве ключа - строковое представление UUID

