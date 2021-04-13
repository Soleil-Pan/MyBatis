package com.pyp.repository;

import com.pyp.entity.Student;

public interface StudentRepository {
    public Student findById(long id);
}
