package QuanLiXe.service;

import java.util.List;

public interface PhuongTienService<E> {
    List<E> findAll();
    void create(E e);
    void edit(E e);
    void delete(String bienSoXe);
    List<E> search(String bienSoXe);
}
