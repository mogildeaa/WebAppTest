package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

