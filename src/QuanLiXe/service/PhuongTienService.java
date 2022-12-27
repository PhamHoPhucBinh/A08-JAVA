package QuanLiXe.service;

import java.util.List;

public interface PhuongTienService<E> {
    List<E> findAll();
    void create(E e);
    void edit(E e);
    void delete(E e);
    List<E> search(String bienSoXe);
}
