package codegym.com.springscurity.services;

import codegym.com.springscurity.model.Role;
import codegym.com.springscurity.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Long id);
    void delete(Long id);
    void save(User user);
    User findByIdL(Long id);
    Page<User> findAll(Pageable pageable);
    Page<User> findByName(String name, Pageable pageable);
    List<User> findAllUser();
}
