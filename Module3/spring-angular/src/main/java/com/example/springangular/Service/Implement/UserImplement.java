package com.example.springangular.Service.Implement;

import com.example.springangular.Reponsitory.UserReponsitory;
import com.example.springangular.Service.userService;
import com.example.springangular.model.Roles;
import com.example.springangular.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserImplement implements userService, UserDetailsService {
    @Autowired
    UserReponsitory userReponsitory;

    @Override
    public Optional<User> findById(Long id) {
        return userReponsitory.findById(id);
    }

    @Override
    public void delete(Long id) {
        userReponsitory.deleteById(id);
    }

    @Override
    public void save(User user) {
        userReponsitory.save(user);
    }

    @Override
    public User findByIdL(Long id) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<User> findByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        return userReponsitory.findAll();
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userReponsitory.findByUsername(s);
        if(user == null){
            throw new UsernameNotFoundException("user not found");
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        Set<Roles> roles = user.getRoles();
        for (Roles role : roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return  new org.springframework.security.core.userdetails.User(
                user.getUsername(), user.getPassword(), grantedAuthorities);
    }

}
