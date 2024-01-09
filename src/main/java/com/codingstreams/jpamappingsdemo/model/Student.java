package com.codingstreams.jpamappingsdemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String studentId;
    private String name;
    private String email;
    private String mobileNo;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "fk_enrollment_id")
    private EnrollmentDetail enrollmentDetail;

    @ManyToOne
    @JoinColumn(name = "fk_branch_id")
    private Branch branch;
}
