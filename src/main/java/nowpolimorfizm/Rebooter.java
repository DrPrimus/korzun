package nowpolimorfizm;


import nowpolimorfizm.api.IRebootable;

/**
 * Тот, кто умее перегружать устройства, которые перегружаемые
 * Синглтон
 * Created by v.hovanski on 21.02.2017.
 */
public class Rebooter implements IRebootable {
    private static Rebooter rebooter;

    private Rebooter() {
    }
   //private static final Singleton _instance = new Singleton()
    public static synchronized Rebooter getInstance(){
        if(rebooter == null)
            rebooter = new Rebooter();

        return rebooter;
    }
    /**
     * Перегрузить устройство
     * @param rebootable  устройство, которое можно перегружать
     */
    void rebootDevice(IRebootable rebootable){
        rebootable.reboot();
    }

    public void reboot() {
    }
}
