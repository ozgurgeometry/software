package com.software.software.DAO;

import com.software.software.Entity.DomesticPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomesticDAO extends JpaRepository<DomesticPayment,Long> {

}
