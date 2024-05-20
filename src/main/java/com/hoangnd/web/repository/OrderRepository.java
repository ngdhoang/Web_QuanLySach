package com.hoangnd.web.repository;

import java.util.List;

import com.hoangnd.web.entity.Order;
import com.hoangnd.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	List<Order> findByUser (User user);
}

