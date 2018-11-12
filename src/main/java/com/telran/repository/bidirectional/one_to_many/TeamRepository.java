package com.telran.repository.bidirectional.one_to_many;

import com.telran.model.bidirectional.one_to_many.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
