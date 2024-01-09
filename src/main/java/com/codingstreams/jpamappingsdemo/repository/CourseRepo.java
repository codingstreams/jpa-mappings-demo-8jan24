package com.codingstreams.jpamappingsdemo.repository;

import com.codingstreams.jpamappingsdemo.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course, String> {
}