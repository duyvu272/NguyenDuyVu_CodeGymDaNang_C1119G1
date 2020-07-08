package codegym.com.springscurity.services;

import codegym.com.springscurity.model.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Optional<Role> findById(Long id);
    void delete(Long id);
    void save(Role role);
    Role findByIdL(Long id);
    Page<Role> findAll(Pageable pageable);
    Page<Role> findByName(String name, Pageable pageable);
    List<Role> findAllRole();
}
