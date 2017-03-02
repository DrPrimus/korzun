package primus;

import java.util.Map;

/**
 * Слой доступа к хранилищу сущностей
 * Created by v.hovanski on 02.03.2017.
 */
public interface IGenericDAO<K, E> {
    //[C]reate

    /**
     * Создание новой сущьности
     * @param entity  новая сущность
     * @return ключ, по которому доступна новая сущность
     */
    K add(E entity);

    //[R]ead

    /**
     * Получение списка всех сохраненных сущьностей
     * @return список всех сохраненных сущьностей
     */
    Map<K, E> list();

    /**
     * Получение по ключу сущности
     * @param key ключ
     * @return  сущность. null есди сущность не найдена по ключу.
     */
    E one(K key);

    //[U]pdate

    /**
     * Обновить сущность по ключу
     * @param key ключ
     * @param entity новое состояние сущности
     * @return предыдущее состояние сущности. null есди сущность не найдена по ключу.
     */
    E update(K key, E entity);

    //[D]elete

    /**
     * Удалить сущьность по ключу
     * @param key ключ
     * @return удаленная сущность. null есди сущность не найдена по ключу.
     */
    E remove(K key);
}
