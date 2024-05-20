package com.hoangnd.web.repository;

import com.hoangnd.web.entity.Account;
import com.hoangnd.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByName(String name);
	User findByAccount(Account account);
}
