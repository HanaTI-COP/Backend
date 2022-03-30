package com.hanati.cop.User.repository;

import com.hanati.cop.User.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
