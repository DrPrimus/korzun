package nowpolimorfizm;

import nowpolimorfizm.api.IRebootable;

/**
 * Тот, кто умее перегружать устройства, которые перегружаемые
 * Синглтон
 * Created by v.hovanski on 21.02.2017.
 */
public class Rebooter {
    private static Rebooter rebooter;

    private Rebooter() {
    }

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
}
