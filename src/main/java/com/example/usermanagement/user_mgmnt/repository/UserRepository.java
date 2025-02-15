package com.example.usermanagement.user_mgmnt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usermanagement.user_mgmnt.entity.Iuser;

public interface UserRepository extends JpaRepository<Iuser, Long> {
	Optional<Iuser> findUsername(String username);

}
