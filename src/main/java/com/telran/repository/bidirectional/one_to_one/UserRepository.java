package com.telran.repository.bidirectional.one_to_one;

import com.telran.model.bidirectional.one_to_one.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
