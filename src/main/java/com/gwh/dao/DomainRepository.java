package com.gwh.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 公共接口调用方法
 * @param <T>
 * @param <PK>
 */
public interface DomainRepository<T,PK extends Serializable> {

    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();

}
