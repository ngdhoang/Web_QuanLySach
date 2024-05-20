package com.hoangnd.web.repository;

import com.hoangnd.web.entity.Account;
import com.hoangnd.web.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Admin findByAccount(Account account);
}
