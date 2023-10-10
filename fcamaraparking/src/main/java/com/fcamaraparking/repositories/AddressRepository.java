package com.fcamaraparking.repositories;

import com.fcamaraparking.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
