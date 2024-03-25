package com.inigomoreno.springjwtauth.user.repository;

import com.inigomoreno.springjwtauth.user.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
