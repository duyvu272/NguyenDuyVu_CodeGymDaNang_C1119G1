package com.codegym.case_study_2.repositories;



import com.codegym.case_study_2.models.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactReponsitory extends JpaRepository<Contact,Long> {

    @Query("select c from Contact c WHERE c.idContact =?1")
    Contact findByIdL(Long id);

    Page<Contact> findAll(Pageable pageable);

    @Query("select c from Contact c where c.nameContact like  ?1%")
    Page<Contact> findByName(String name, Pageable pageable);
}
