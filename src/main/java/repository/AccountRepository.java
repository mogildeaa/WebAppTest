package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
