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

    private HeadphonesDAO() {
        storage = new HashMap<>();
    }
    private Map<String, Headphones> storage;

    UUID idOne = UUID.randomUUID();

    public static synchronized IHeadphonesDAO getINSTANCE(){
        if(INSTANCE == null)
            INSTANCE = new HeadphonesDAO();

        return INSTANCE;
    }
    @Override
    public String add(Headphones entity){
        String key = idOne.toString();
        storage.put(idOne.toString(), entity);
        idOne.toString();
        return key;
    }

    @Override
    public Map<String, Headphones> list(){return storage;}

    @Override
    public Headphones one(String key) {return one(idOne.toString());}

    @Override
    public Headphones update(String key, Headphones entity) {
        storage.put(idOne.toString(), entity);
        return storage.get(idOne);
    }

    @Override
    public Headphones remove(String key) {return storage.remove(idOne);}
    }

    //TODO Написать реализацию интерфейса хранилища наушников. В качестве ключа - строковое представление UUID

