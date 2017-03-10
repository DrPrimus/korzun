package primus;

import headphones.Headphones;

import java.util.UUID;

/**
 * Слой доступа к хранилищу наушников
 * Created by v.hovanski on 02.03.2017.
 */
public interface IHeadphonesDAO extends IGenericDAO<UUID, Headphones> {
}
