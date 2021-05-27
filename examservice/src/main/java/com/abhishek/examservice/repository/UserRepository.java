package com.abhishek.examservice.repository;

import com.abhishek.examservice.entiity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
