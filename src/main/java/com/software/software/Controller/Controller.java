package com.software.software.Controller;

import com.software.software.Entity.DomesticPayment;
import com.software.software.Entity.InternationalPayment;
import com.software.software.Service.DomesticService;
import com.software.software.Service.InternationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private DomesticService domesticService;

    @Autowired
    private InternationalService internationalService;


    @RequestMapping(method = RequestMethod.GET,value = "/domestic")
    public List<DomesticPayment> getAllDomestic(){
        return domesticService.getAllDomestic();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/international")
    public List<InternationalPayment> getAllInternational(){
        return internationalService.getAllInternational();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/domesticcreate")

    public void createDomestic(@RequestBody DomesticPayment domesticPayment)
    {
        domesticService.save(domesticPayment);

    }

    @RequestMapping(method = RequestMethod.POST,value = "intcreate")
    public void createInternational(@RequestBody InternationalPayment internationalPayment){
        internationalService.save(internationalPayment);
    }





}
