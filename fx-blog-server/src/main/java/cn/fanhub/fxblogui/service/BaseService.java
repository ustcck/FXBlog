package cn.fanhub.fxblogui.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author chengfan
 * @date 2018-2-8 22:18:45
 */
public interface BaseService<T, ID extends Serializable>{
    /**
     * Save t.
     *
     * @param t the t
     * @return the t
     */
    T save(T t);

    /**
     * Save iterable.
     *
     * @param <S>  the type parameter
     * @param iterable the iterable
     * @return the iterable
     */
    <S extends T> Iterable<S> save(Iterable<S> iterable);

    /**
     * Update t.
     *
     * @param t the t
     * @return the t
     */
    T update(T t);

    /**
     * Delete.
     *
     * @param t the t
     */
    void delete(T t);

    /**
     * Gets by name.
     *
     * @param name the name
     * @return the by name
     */
    T getByName(String name);

    /**
     * Gets one.
     *
     * @param id the id
     * @return the one
     */
    T getOne(ID id);

    /**
     * Gets count.
     *
     * @return the count
     */
    long getCount();

    /**
     * Gets all.
     *
     * @return the all
     */
    List<T> getAll();

    /**
     * Gets all.
     *
     * @param ids the ids
     * @return the all
     */
    List<T> getAll(List<ID> ids);


}