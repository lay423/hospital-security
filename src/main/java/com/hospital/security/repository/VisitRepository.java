package com.hospital.security.repository;

import com.hospital.security.domain.entity.Hospital;
import com.hospital.security.domain.entity.User;
import com.hospital.security.domain.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VisitRepository extends JpaRepository<Visit, Long> {

    public List<Visit> findAllByUser(User user);

    public List<Visit> findAllByHospital(Hospital hospital);
}
