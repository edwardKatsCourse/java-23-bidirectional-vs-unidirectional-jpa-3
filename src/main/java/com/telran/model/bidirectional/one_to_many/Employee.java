package com.telran.model.bidirectional.one_to_many;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeName;

    @ManyToOne
    private Team employeeTeam;
//    private Team team2;
//    private Team team3;
//    private Team team4;
//    private Team team100500;
}
