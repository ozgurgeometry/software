package com.software.software.Service;
import com.software.software.DAO.DomesticDAO;
import com.software.software.Entity.DomesticPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomesticService {

    @Autowired
    private DomesticDAO domesticDAO;

    public void save(DomesticPayment domesticPayment){

        domesticDAO.save(domesticPayment);
    }

    public List<DomesticPayment> getAllDomestic(){
        List<DomesticPayment> list = new ArrayList<>();
        domesticDAO.findAll().forEach(domesticPayment -> list.add(domesticPayment));
        return list;
    }

}