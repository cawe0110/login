package com.simple.form.repository;

import com.simple.form.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel, Integer> {

    Optional<UsersModel> findByLogAndPassword(String login, String password);

    UsersModel findByLoginAndPassword(String login, String password);
}
