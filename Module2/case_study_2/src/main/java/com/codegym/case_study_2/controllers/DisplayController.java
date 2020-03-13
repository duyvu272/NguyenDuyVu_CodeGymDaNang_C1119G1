package com.codegym.case_study_2.controllers;

import com.codegym.case_study_2.models.*;
import com.codegym.case_study_2.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("favorite")
public class DisplayController {

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

    @ModelAttribute("favorite")
    public FavoriteService setupSession(){
        return new FavoriteService();
    }

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


    @GetMapping("/")
    public ModelAndView homePage(@RequestParam("searchCate") Optional<String> search,@PageableDefault(value = 3) Pageable pageable){
        Page<Service> services;
        ModelAndView modelAndView = new ModelAndView("index");
        if (search.isPresent()) {
            services = furamaService.findByName(search.get(), pageable);
            modelAndView.addObject("nameService", search.get());
            modelAndView.addObject("listServiceCate", services);
        } else {
            services = furamaService.findAll(pageable);
            modelAndView.addObject("listServiceCate", services);
        }

        return modelAndView;
    }


    @GetMapping("/listCustomerD")
    public ModelAndView displayCustomers(@RequestParam("search") Optional<String> name, Pageable pageable) {
        Page<Customer> customers;
        ModelAndView modelAndView = new ModelAndView("display/customers");
        if (name.isPresent()) {
            customers = customerService.findByName(name.get(), pageable);
            modelAndView.addObject("nameCustomer", name.get());
        } else {
            customers = customerService.findAll(pageable);
        }
        modelAndView.addObject("listCustomerA", customers);
        return modelAndView;
    }

    @GetMapping("/listContact")
    public ModelAndView displayContact(@RequestParam("search") Optional<String> name, Pageable pageable) {
        Page<Contact> contacts;
        ModelAndView modelAndView = new ModelAndView("display/contacts");
        if (name.isPresent()) {
            contacts = contactService.findByName(name.get(), pageable);
            modelAndView.addObject("nameContact", name.get());
        } else {
            contacts = contactService.findAll(pageable);
        }
        modelAndView.addObject("listContactA", contacts);
        return modelAndView;
    }


    @GetMapping("/listService")
    public ModelAndView displayServices(@RequestParam("search") Optional<String> name, Pageable pageable) {
        Page<Service> services;
        ModelAndView modelAndView = new ModelAndView("display/services");
        if (name.isPresent()) {
            services = furamaService.findByName(name.get(), pageable);
            modelAndView.addObject("nameService", name.get());
        } else {
            services = furamaService.findAll(pageable);
        }
        modelAndView.addObject("listServiceA", services);
        return modelAndView;
    }


    @GetMapping("listCustomerD/{id}/edit")
    public String editCustomerView(@PathVariable("id") long id, Model model) {
        model.addAttribute("customer", customerService.findByIdL(id));
        return "display/edit_customer";
    }

    @GetMapping("listContact/{id}/edit")
    public String editContactView(@PathVariable("id") long id, Model model) {
        model.addAttribute("contact", contactService.findByIdL(id));
        return "display/edit_contact";
    }

    @GetMapping("listService/{id}/edit")
    public String editServiceView(@PathVariable("id") long id, Model model) {
        model.addAttribute("service", furamaService.findByIdL(id));
        return "display/edit_service";
    }


    @PostMapping("/editCustomer")
    public String editCustomer(Customer customer, RedirectAttributes attributes, @RequestParam("birthday") String birthday) {
        if (customer.getIdCustomer() != null) {
            customer.setBirthdayCustomer(convertDate(birthday));
            customerService.save(customer);
            attributes.addFlashAttribute("mess", "Edit successfully");
        }

        return "redirect:/listCustomerD";
    }

    @PostMapping("/editContact")
    public String editContact(Contact contact, RedirectAttributes attributes,
                              @RequestParam("startDate") String startDate,
                              @RequestParam("endDate") String endDate) {
        if (contact.getIdContact() != null) {
            contact.setStartDate(convertDate(startDate));
            contact.setEndDate(convertDate(endDate));
            contactService.save(contact);
            attributes.addFlashAttribute("mess", "Edit successfully");
        }

        return "redirect:/listContact";
    }

    @PostMapping("/editService")
    public String editService(Service service, RedirectAttributes attributes) {
        if (service.getIdService() != null) {
            furamaService.save(service);
            attributes.addFlashAttribute("mess", "Edit successfully");
        }

        return "redirect:/listService";
    }


    @GetMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable("id") Long id, RedirectAttributes attributes) {
        customerService.delete(id);
        attributes.addFlashAttribute("messDele", "Customer delete successfully");
        return "redirect:/listCustomerD";
    }

    @GetMapping("/deleteContact/{id}")
    public String deleteContact(@PathVariable("id") Long id, RedirectAttributes attributes) {
        contactService.delete(id);
        attributes.addFlashAttribute("messDeleteContact", "Contact delete successfully");
        return "redirect:/listContact";
    }

    @GetMapping("/deleteService/{id}")
    public String deleteService(@PathVariable("id") Long id, RedirectAttributes attributes) {
        furamaService.delete(id);
        attributes.addFlashAttribute("messDeleteService", "Service delete successfully");
        return "redirect:/listService";
    }


    @GetMapping("/listCustomerD/{id}/view")
    public String customerView(@PathVariable("id") long id, Model model) {
        model.addAttribute("customer", customerService.findByIdL(id));
        return "display/viewCustomer";
    }


    @GetMapping("/listContact/{id}/view")
    public String contactView(@PathVariable("id") long id, Model model) {
        model.addAttribute("contact", contactService.findByIdL(id));
        return "display/viewContact";
    }


    @GetMapping("/listService/{id}/view")
    public String serviceView(@PathVariable("id") long id, Model model) {
        model.addAttribute("service", furamaService.findByIdL(id));
        return "display/viewService";
    }


    @GetMapping("/category")
    public ModelAndView categoryService(@RequestParam("searchCate") Optional<String> search,@PageableDefault(value = 6) Pageable pageable){
        Page<Service> services;
        ModelAndView modelAndView = new ModelAndView("display/category-service");
        if (search.isPresent()) {
            services = furamaService.findByName(search.get(), pageable);
            modelAndView.addObject("nameService", search.get());
        } else {
            services = furamaService.findAll(pageable);
        }
        modelAndView.addObject("listServiceCate", services);
        return modelAndView;
    }


    @GetMapping("/serviceDetail/{id}")
    public ModelAndView viewServiceDetail(@PathVariable("id") Long id){
        return new ModelAndView("display/service-detail","serviceDetail",furamaService.findByIdL(id));
    }

    @GetMapping("/user-create-contact/{id}")
    public ModelAndView userCreateContactView(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("user/create-contact");
        modelAndView.addObject("service1",furamaService.findByIdL(id));
        modelAndView.addObject("contact1",new Contact());
        return modelAndView;
    }
    @PostMapping("/addNewContactUser")
    public String addUserContact(@RequestParam("idService") Long id,Contact contact,@RequestParam("startDate1") String starDate,
                                 @RequestParam("endDate1") String endDate,RedirectAttributes attributes){

        Service service = furamaService.findByIdL(id);
        contact.setTotalMoney(service.getPriceService());
        contact.setService(service);
        contact.setStartDate(convertDate(starDate));
        contact.setEndDate(convertDate(endDate));
        contactService.save(contact);
//        System.out.println(id + "hhhhh");
        attributes.addFlashAttribute("messenger","Successfully");
        return "redirect:/user-create-contact/"+id;
    }
    @GetMapping("favor/{id}")
      public String viewFavorite(@PathVariable("id") long id,@ModelAttribute("favorite") FavoriteService session){
        session.add(furamaService.findByIdL(id));
        return "redirect:/";
    }

    @GetMapping("/favoritePage")
    public String vireFavorite(){
        return "user/favorite";
    }


    //convert LocalDate
    public LocalDate convertDate
    (String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate;
    }


}
