package com.codegym.case_study_2.controllers;

import com.codegym.case_study_2.models.*;
import com.codegym.case_study_2.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
public class AdminController {


    @Autowired
    CustomerService customerService;

    @Autowired
    TypeOfCustomerService typeOfCustomerService;

    @Autowired
    ContactService contactService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ServicesFuramaService furamaService;

    @Autowired
    TypeOfRentService rentService;

    @Autowired
    TypeOfServiceS typeOfServiceS;

    @Autowired
    ContactDetailService contactDetailService;

    @Autowired
    AccompanyingServiceF accompanyingServiceF;


    @ModelAttribute("typeOfCustomer")
    public List<TypeOfCustomer> listTypeCustomer() {
        return typeOfCustomerService.findAllC();
    }

    @ModelAttribute("listCustomer")
    public List<Customer> listCustomer() {
        return customerService.findAllCustomer();
    }

    @ModelAttribute("listEmployee")
    public List<Employee> listEmployee() {
        return employeeService.findAllEmployee();
    }

    @ModelAttribute("listService")
    public List<Service> listService() {
        return furamaService.findAllService();
    }

    @ModelAttribute("listRent")
    public List<TypeOfRent> listTypeOfRent() {
        return rentService.findAllTypeOfRent();
    }

    @ModelAttribute("listTypeOfService")
    public List<TypeOfService> listTypeOfService() {
        return typeOfServiceS.findAllTypeOfServiceS();
    }

    @ModelAttribute("listContact")
    public List<Contact> listContact() {
        return contactService.findAllContact();
    }

    @ModelAttribute("listAccompanyingService")
    public List<AccompanyingServices> listAccompanyingService() {
        return accompanyingServiceF.findAllAccService();
    }


    @GetMapping("/addCustomer")
    public ModelAndView viewAddCustomer() {
        return new ModelAndView("admin/create_customer", "customer", new Customer());
    }

    @PostMapping("/addNewCustomer")
    public String addCustomer(@Validated Customer customer,
                              BindingResult result, RedirectAttributes attributes) {
        new Customer().validate(customer, result);
        if (result.hasErrors()) {
            return "admin/create_customer";
        } else {
//            customer.setBirthdayCustomer(convertDate(date));
            customerService.save(customer);
            attributes.addFlashAttribute("message", "Add Successfully");
            return "redirect:/addCustomer";
        }
    }

    @GetMapping("addContact")
    public ModelAndView viewAddContact() {
        return new ModelAndView("/admin/create_contact", "contact", new Contact());
    }

    @PostMapping("addNewContact")
    public String addContact(@RequestParam("startDate1") String startDate,
                             @RequestParam("endDate1") String endDate,
                             Contact contact, RedirectAttributes attributes) {
        contact.setStartDate(convertDate(startDate));
        contact.setEndDate(convertDate(endDate));
        contactService.save(contact);
        attributes.addFlashAttribute("message", "Add Successfully");
        return "redirect:/addContact";
    }

    @GetMapping("addService")
    public ModelAndView viewAddService() {
        return new ModelAndView("/admin/create_service", "service", new Service());
    }

    @PostMapping("addNewService")
    public String addService(Service service, RedirectAttributes attributes) {
        furamaService.save(service);
        attributes.addFlashAttribute("message", "Add Successfully");
        return "redirect:/addService";
    }

    @GetMapping("addContactDetail")
    public ModelAndView viewAddContactDetail() {
        return new ModelAndView("/admin/create_contact_detail", "contactDetail", new ContactDetails());
    }

    @PostMapping("addNewContactDetail")
    public String addContactDetail(ContactDetails contact, RedirectAttributes attributes) {
        contactDetailService.save(contact);
        attributes.addFlashAttribute("message", "Add Successfully");
        return "redirect:/addContactDetail";
    }

    //convert LocalDate
    public LocalDate convertDate(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate;
    }
}
