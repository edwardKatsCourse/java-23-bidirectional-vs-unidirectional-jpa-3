package com.telran.repository.unidirectional.many_to_one;

import com.telran.model.unidirectional.many_to_one.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
