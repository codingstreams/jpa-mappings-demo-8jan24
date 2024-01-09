package com.codingstreams.jpamappingsdemo.repository;

import com.codingstreams.jpamappingsdemo.model.EnrollmentDetail;
import org.springframework.data.repository.CrudRepository;

public interface EnrollmentDetailRepo extends CrudRepository<EnrollmentDetail, String> {
}
