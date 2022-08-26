package com.payment.repositories;

import java.util.List;

public interface DaoRepository<T> {
    void insert(T obj);
    void update(T obj);
    void deleteById(int id);
    T findById(int id);
    List<T> findAll();
}
