package com.codingstreams.jpamappingsdemo.repository;

import com.codingstreams.jpamappingsdemo.model.Branch;
import org.springframework.data.repository.CrudRepository;

public interface BranchRepo extends CrudRepository<Branch, String> {
}
