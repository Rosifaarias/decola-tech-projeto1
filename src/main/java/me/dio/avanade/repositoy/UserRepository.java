package me.dio.avanade.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.avanade.Model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
	 boolean existsByAccountNumber(String accountNumber);
	

}
