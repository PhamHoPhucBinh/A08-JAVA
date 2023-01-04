package _Shop_Management.service;

import java.util.List;

public interface ProductService<E> {
    List<E> findAll();
    void create(E e);
    boolean findByID(String productID);
    void delete(String productID);
    List<E> search(String productID);
}
