package guru.springframework.sfgpetclinic.service;

import java.util.Collection;

public interface CrudService<T, ID> {
    Collection<T> findAll();
    T save(T object);
    T findById(ID id);
    void delete(T object);
    void deleteById(ID id);
}
