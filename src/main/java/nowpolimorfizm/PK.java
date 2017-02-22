package nowpolimorfizm;

import nowpolimorfizm.api.IRebootable;

/**
 * Created by Vova on 19.02.2017.
 */
public class PK implements IRebootable {
    @Override
    public void reboot() {
        System.out.println("перезагружаю пк");
    }
}
