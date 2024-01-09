package com.codingstreams.jpamappingsdemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String branchId;
    private String branchCode;
    private String name;

    @ManyToMany
    @JoinTable(
        name = "branch_course",
        joinColumns = @JoinColumn(name = "fk_branch_id"),
        inverseJoinColumns = @JoinColumn(name = "fk_course_id")
    )
    private List<Course> courseList;
}
