package com.louay.projects.registration.model.dao;

import com.louay.projects.registration.model.entity.Student;

import java.sql.ResultSet;

public interface StudentDAO {

    Student findById(String key);

    Student findByEmail(String key);

    Student buildStudent(ResultSet resultSet);

    Student create(Student student);

    Student update(Student student);

    boolean delete(Student student);

}
