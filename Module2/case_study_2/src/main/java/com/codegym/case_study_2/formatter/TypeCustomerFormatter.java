package com.codegym.case_study_2.formatter;

import com.codegym.case_study_2.models.TypeOfCustomer;
import com.codegym.case_study_2.services.TypeOfCustomerService;
import com.codegym.case_study_2.services.TypeOfServiceS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class TypeCustomerFormatter implements Formatter<TypeOfCustomer> {


    private TypeOfCustomerService customerService;

    @Autowired
    public TypeCustomerFormatter(TypeOfCustomerService typeOfCustomerService){
        this.customerService = typeOfCustomerService;
    }

    @Override
    public TypeOfCustomer parse(String s, Locale locale) throws ParseException {
        return customerService.findByIdL(Long.parseLong(s));
    }

    @Override
    public String print(TypeOfCustomer typeOfCustomer, Locale locale) {
        return null;
    }
}
