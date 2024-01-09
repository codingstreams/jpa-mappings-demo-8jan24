package com.codingstreams.jpamappingsdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String enrollmentId;
    @CreationTimestamp
    private LocalDateTime dateOfEnrollment;
    private String mode;
    private String status;
}
