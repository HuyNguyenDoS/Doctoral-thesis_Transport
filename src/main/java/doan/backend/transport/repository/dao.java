package doan.backend.transport.repository;

import java.util.List;
import java.util.Optional;

public interface dao<T> {
    List<T> getList();
    Optional<T> findById(int id);
    void insert(T vo);
    void update(T vo);
    void delete(int id);
}
