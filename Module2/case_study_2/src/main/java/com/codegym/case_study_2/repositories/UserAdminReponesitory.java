package com.codegym.case_study_2.repositories;

import com.codegym.case_study_2.models.TypeOfService;
import com.codegym.case_study_2.models.UserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserAdminReponesitory extends JpaRepository<UserAdmin,Long> {
    @Query("select c from UserAdmin c WHERE c.idRule =?1")
    UserAdmin findByIdL(Long id);

}
