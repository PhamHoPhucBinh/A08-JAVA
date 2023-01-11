package _Phone_Management.service;

import _Phone_Management.model.BrandNew;

import java.util.List;

public interface PhoneService<E> {
    List<E> findAll();
    void create(E e);
    boolean findByID(String id);
    void delete(String id);
    List<E> search(String id);
}
