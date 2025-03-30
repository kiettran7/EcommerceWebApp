package com.kiet.ecommerce.repositories;

import com.kiet.ecommerce.POJOs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}