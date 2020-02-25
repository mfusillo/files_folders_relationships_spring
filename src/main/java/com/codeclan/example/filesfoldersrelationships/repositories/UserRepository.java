package com.codeclan.example.filesfoldersrelationships.repositories;

import com.codeclan.example.filesfoldersrelationships.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
