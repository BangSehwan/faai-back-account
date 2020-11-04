package com.faai.account.repository;

import com.faai.account.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users, UUID> {
  public Users findByUserName(String userName);
  public Users findByUserNameAndPassword(String userName, String password);
}