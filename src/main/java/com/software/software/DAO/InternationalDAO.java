package com.software.software.DAO;

import com.software.software.Entity.InternationalPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternationalDAO extends JpaRepository<InternationalPayment,Long> {
}
