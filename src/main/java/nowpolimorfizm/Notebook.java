package nowpolimorfizm;

import nowpolimorfizm.api.IRebootable;

/**
 * Created by Vova on 17.02.2017.
 */
public class Notebook implements IRebootable {

    @Override
    public void reboot() {
        System.out.println("перезагружаю ноутбук");
    }
}

