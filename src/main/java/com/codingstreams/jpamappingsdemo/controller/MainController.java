package com.codingstreams.jpamappingsdemo.controller;

import com.codingstreams.jpamappingsdemo.model.Branch;
import com.codingstreams.jpamappingsdemo.model.Course;
import com.codingstreams.jpamappingsdemo.model.EnrollmentDetail;
import com.codingstreams.jpamappingsdemo.model.Student;
import com.codingstreams.jpamappingsdemo.repository.BranchRepo;
import com.codingstreams.jpamappingsdemo.repository.CourseRepo;
import com.codingstreams.jpamappingsdemo.repository.EnrollmentDetailRepo;
import com.codingstreams.jpamappingsdemo.repository.StudentRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/college")
@RequiredArgsConstructor
public class MainController {
  private final BranchRepo branchRepo;
  private final CourseRepo courseRepo;
  private final StudentRepo studentRepo;
  private final EnrollmentDetailRepo enrollmentDetailRepo;
  private final ObjectMapper objectMapper;

  @GetMapping("/{type}/")
  public ResponseEntity<?> getEntityDetails(@PathVariable String type) {
    if (type.equals("student")) {
      return ResponseEntity.ok()
          .body(studentRepo.findAll());
    }

    if (type.equals("branch")) {
      return ResponseEntity.ok()
          .body(branchRepo.findAll());
    }

    if (type.equals("course")) {
      return ResponseEntity.ok()
          .body(courseRepo.findAll());
    }

    return ResponseEntity.ok()
        .body(enrollmentDetailRepo.findAll());
  }

  @PostMapping("/{type}/")
  public ResponseEntity<?> addEntityDetails(@PathVariable String type, @RequestBody String json) throws JsonProcessingException {

    if (type.equals("student")) {
      return ResponseEntity.ok()
          .body(studentRepo.save(objectMapper.readValue(json, Student.class)));
    }

    if (type.equals("branch")) {
      return ResponseEntity.ok()
          .body(branchRepo.save(objectMapper.readValue(json, Branch.class)));
    }

    if (type.equals("course")) {
      return ResponseEntity.ok()
          .body(courseRepo.save(objectMapper.readValue(json, Course.class)));
    }

    return ResponseEntity.ok()
        .body(enrollmentDetailRepo.save(objectMapper.readValue(json, EnrollmentDetail.class)));
  }
}
