package com.example.crud;

import com.example.crud.student;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentResitory extends JpaRepository<Student, Long>{
	
}