package com.fcamaraparking.repositories;

import com.fcamaraparking.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
