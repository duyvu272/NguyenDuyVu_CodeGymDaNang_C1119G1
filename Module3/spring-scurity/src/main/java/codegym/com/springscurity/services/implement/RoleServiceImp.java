package codegym.com.springscurity.services.implement;

import codegym.com.springscurity.model.Role;
import codegym.com.springscurity.repository.RoleRepository;
import codegym.com.springscurity.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Optional<Role> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(Role role) {

    }

    @Override
    public Role findByIdL(Long id) {
        return null;
    }

    @Override
    public Page<Role> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Role> findByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public List<Role> findAllRole() {
        return roleRepository.findAll();
    }
}
