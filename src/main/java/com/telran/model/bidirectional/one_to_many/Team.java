package com.telran.model.bidirectional.one_to_many;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        //1

    private String teamName;//Team One

    @OneToMany(mappedBy = "employeeTeam")
    private List<Employee> employees;//1,2,3

}
