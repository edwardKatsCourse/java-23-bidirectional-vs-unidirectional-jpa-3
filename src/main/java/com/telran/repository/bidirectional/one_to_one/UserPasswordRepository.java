package com.telran.repository.bidirectional.one_to_one;

import com.telran.model.bidirectional.one_to_one.UserPassword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPasswordRepository extends JpaRepository<UserPassword, Long> {
}
