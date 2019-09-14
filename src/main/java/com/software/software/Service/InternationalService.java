package com.software.software.Service;

import com.software.software.DAO.InternationalDAO;
import com.software.software.Entity.InternationalPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InternationalService {

    @Autowired
    private InternationalDAO internationalDAO;

    public void save(InternationalPayment internationalPayment) {
        internationalDAO.save(internationalPayment);
    }

    public List<InternationalPayment> getAllInternational() {
        List<InternationalPayment> list = new ArrayList<>();
        internationalDAO.findAll().forEach(internationalPayment -> list.add(internationalPayment));
        return list;
    }
}