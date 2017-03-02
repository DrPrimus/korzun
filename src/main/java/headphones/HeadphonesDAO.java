package headphones;

import primus.IHeadphonesDAO;

/**
 * Реализация слоя доступа к хранилищу наушников
 * Created by v.hovanski on 02.03.2017.
 */
public class HeadphonesDAO implements IHeadphonesDAO {
    private static IHeadphonesDAO INSTANCE;

    private HeadphonesDAO() {
    }

    public static synchronized IHeadphonesDAO getINSTANCE(){
        if(INSTANCE == null)
            INSTANCE = new HeadphonesDAO();

        return INSTANCE;
    }

    //TODO Написать реализацию интерфейса хранилища наушников. В качестве ключа - строковое представление UUID

}
