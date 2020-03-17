package com.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portal.model.User;

public interface UserRepository extends JpaRepository <User, Long> {

}