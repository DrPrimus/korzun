package storage.impl;

import headphones.Headphones;
import storage.IHeadphonesStorage;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Vova on 09.03.2017.
 */
public class HeadphonesStorage implements IHeadphonesStorage {

    private static IHeadphonesStorage INSTANCE;

    private Map<UUID, Headphones> storage;

    private HeadphonesStorage(){
        storage = new HashMap<>();
    }

    public static synchronized IHeadphonesStorage getINSTANCE(){

        if(INSTANCE == null){
            INSTANCE = new HeadphonesStorage();
        }

        return INSTANCE;
    }

    public UUID add(Headphones value){
        UUID key = UUID.randomUUID();
        storage.put(key, value);
        return key;
    }

    public Headphones get(UUID key){
        return storage.get(key);
    }

    public Map<UUID, Headphones> all(){
        return storage;
    }

    public Headphones update(UUID key, Headphones value){
        storage.put(key, value);
        return storage.get(key);
    }

    public Headphones remove(UUID key){
        return storage.remove(key);
    }

}
