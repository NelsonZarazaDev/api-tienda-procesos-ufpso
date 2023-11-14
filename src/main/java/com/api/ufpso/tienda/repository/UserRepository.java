package com.api.ufpso.tienda.repository;

import com.api.ufpso.tienda.model.User;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {
    Optional<User> findOneByEmail(String email);
}