package com.telran;

import com.telran.model.bidirectional.one_to_many.Employee;
import com.telran.model.bidirectional.one_to_many.Team;
import com.telran.model.bidirectional.one_to_one.User;
import com.telran.model.bidirectional.one_to_one.UserPassword;
import com.telran.model.unidirectional.many_to_one.Group;
import com.telran.model.unidirectional.many_to_one.Student;
import com.telran.repository.bidirectional.one_to_many.EmployeeRepository;
import com.telran.repository.bidirectional.one_to_many.TeamRepository;
import com.telran.repository.bidirectional.one_to_one.UserPasswordRepository;
import com.telran.repository.bidirectional.one_to_one.UserRepository;
import com.telran.repository.unidirectional.many_to_one.GroupRepository;
import com.telran.repository.unidirectional.many_to_one.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    private UserRepository userRepository;
    private UserPasswordRepository userPasswordRepository;
    private EmployeeRepository employeeRepository;
    private TeamRepository teamRepository;
    private GroupRepository groupRepository;
    private StudentRepository studentRepository;

    @Autowired
    public Runner(UserRepository userRepository, UserPasswordRepository userPasswordRepository, EmployeeRepository employeeRepository, TeamRepository teamRepository, GroupRepository groupRepository, StudentRepository studentRepository) {
        this.userRepository = userRepository;
        this.userPasswordRepository = userPasswordRepository;
        this.employeeRepository = employeeRepository;
        this.teamRepository = teamRepository;
        this.groupRepository = groupRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Group group = new Group();
        group.setGroupName("Java 23");

        groupRepository.save(group);

        Student student = new Student();
        student.setName("Student_1");
        student.setGroup(group);

        studentRepository.save(student);

        System.out.println(studentRepository.findByGroup_Id(group.getId()));
    }

    private void bidirectional_one_to_many() {
        Team team = new Team();
        team.setTeamName("Фиолетовые");
        teamRepository.save(team);
        Employee employee = new Employee();
        employee.setEmployeeName("Moshe");
        employee.setEmployeeTeam(team);
        employeeRepository.save(employee);
        List<Employee> employees = team.getEmployees();
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
        team.setEmployees(employees);
        teamRepository.save(team);
    }





    private void bidirectional_one_to_one() {
        User user = new User();
        user.setUsername("user_1");
        userRepository.save(user);


        UserPassword userPassword = new UserPassword();
        userPassword.setPassword("123456");
        userPassword.setUser(user);

        userPasswordRepository.save(userPassword);


        user.setUserPassword(userPassword);
        userRepository.save(user);

        System.out.println();
    }
}
