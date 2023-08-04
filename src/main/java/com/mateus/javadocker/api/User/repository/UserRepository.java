package com.mateus.javadocker.api.User.repository;

import com.mateus.javadocker.api.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

