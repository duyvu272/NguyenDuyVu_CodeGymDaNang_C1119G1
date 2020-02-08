package controllers;


import commons.*;
import models.*;

import java.io.BufferedReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MainController {

    List<Villa> villas = new ArrayList<>();
    List<House> houses = new ArrayList<>();
    List<Room> rooms = new ArrayList<>();
    List<Customer> sortCustomer = new ArrayList<>();
    List<Customer> customerBookingVilla = new ArrayList<>();
    List<Customer> customerBookingHouse = new ArrayList<>();
    List<Customer> customerBookingRoom = new ArrayList<>();
    TreeSet<Customer> customerTreeSetVilla = new TreeSet<>(new HashSet<>());
    TreeSet<Customer> customerTreeSetHouse = new TreeSet<>(new HashSet<>());
    TreeSet<Customer> customerTreeSetRoom = new TreeSet<>(new HashSet<>());
    TreeSet<Services> showService = new TreeSet<>(new HashSet<>());
    Queue<Customer> ciname4D = new LinkedList<>();
    Map<String, Employee> map = new HashMap<String, Employee>();


    final String regex = "^(\\p{Lu}{1}\\p{L}*)( \\p{Lu}{1}\\p{L}*)*$";
    final String fileName = "D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Customer.csv";

    public Map addEmployye() {
        Employee em1 = new Employee("100", "Tuyet", 22, "Da Nang");
        Employee em2 = new Employee("101", "Lan", 24, "Quang Nam");
        Employee em3 = new Employee("102", "Hong", 21, "Da Nang");
        Employee em4 = new Employee("103", "Diep", 20, "Quang Nam");
        Employee em5 = new Employee("104", "Trinh", 19, "Da Nang");
        Employee em6 = new Employee("105", "Ngoc", 20, "Quang Nam");
        Employee em7 = new Employee("106", "Thanh", 22, "Da Nang");
        Employee em8 = new Employee("107", "Nam", 24, "Quang Nam");
        Employee em9 = new Employee("108", "Bac", 25, "Da Nang");
        Employee em10 = new Employee("109", "Son", 26, "Da Nang");

        map.put(em1.getId(), em1);
        map.put(em2.getId(), em2);
        map.put(em3.getId(), em3);
        map.put(em4.getId(), em4);
        map.put(em5.getId(), em5);
        map.put(em6.getId(), em6);
        map.put(em7.getId(), em7);
        map.put(em8.getId(), em8);
        map.put(em9.getId(), em9);
        map.put(em10.getId(), em10);
        return map;
    }

    public void addNewCustomer() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        String name, date, gender = "", id = "", phone = "", email = "", member = "", address = "";
        Date dayOfBirth = null;
        String convert = "";
        do {
            System.out.println("input name ");
            name = sc.nextLine();
            try {
                NameException.checkName(name);
            } catch (NameException e) {
                System.err.println(e.getMessage());
                continue;
            }

            System.out.println("input Day of birth");
            date = sc.nextLine();
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                BirthdayException.checkBirthday(date);
                dayOfBirth = dateFormat.parse(date);
            } catch (BirthdayException d) {
                System.err.println(d.getMessage());
                continue;
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("Gender");
            gender = sc.nextLine();
            try {
                GenderException.checkGender(gender);
            } catch (GenderException g) {
                System.err.println(g.getMessage());
                continue;
            }

            convert +=name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

            id = UUID.randomUUID().toString().replace("-", "");
            System.out.println("phone number");
            phone = sc.nextLine();
            System.out.println("Email");
            email = sc.nextLine();
            try {
                EmailException.checkMail(email);
            } catch (EmailException e) {
                System.err.println(e.getMessage());
                continue;
            }
            System.out.println("MemberShip");
            member = sc.nextLine();
            System.out.println("Address");
            address = sc.nextLine();
            check = true;
        } while (!check);
        Customer customer = new Customer(name, dayOfBirth, convert, id, phone, email, member, address);
        sortCustomer.add(customer);
        Collections.sort(sortCustomer, new CustomerComparator());
        FuncWriteFileCSV.writeCsvFileCustomer(fileName, sortCustomer);
    }

    public List<Villa> addNewVilla() {
        String name = "", typeRent = "", room = "", f = "", id = "";
        double area = 0, cost = 0, a = 0;
        int amount = 0, floor = 0;
        boolean check = false;
        id = UUID.randomUUID().toString().replace("-", "");
        do {
            Scanner c = new Scanner(System.in);
            try {

                System.out.println("Name Service :");
                name = c.nextLine();
                boolean testName = name.matches(regex);
                if (!testName) {
                    System.out.println(name + " invalid");
                    continue;
                }
                System.out.println("Area : ");
                area = c.nextDouble();
                if (area < 30) {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Cost");
                cost = c.nextDouble();
                if (cost < 0) {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Amount of People : ");
                amount = c.nextInt();
                if (amount < 0 || amount > 20) {
                    System.out.println("invalid");
                    continue;
                }

                System.out.println("Type of rent :");
                c.nextLine();
                typeRent = c.nextLine();
                boolean testRent = typeRent.matches(regex);
                if (!testRent) {
                    System.out.println(typeRent + "invalid");
                    continue;
                }
                System.out.println("Type of room :");
                room = c.nextLine();
                boolean testRoom = room.matches(regex);
                if (!testRoom) {
                    System.out.println(room + "wrong format");
                    continue;
                }
                System.out.println("other facility :");
                f = c.nextLine();
                if (f.equalsIgnoreCase("massage") || f.equalsIgnoreCase("karaoke") ||
                        f.equalsIgnoreCase("food") || f.equalsIgnoreCase("drink") ||
                        f.equalsIgnoreCase("car")) {

                } else {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Floor");
                //c.nextLine();
                floor = c.nextInt();
                if (floor < 0) {
                    System.out.println(floor + "invalid");
                    continue;
                }
                System.out.println("Area of Pool");
                a = c.nextDouble();
                if (area < 30) {
                    System.out.println("invalid");
                    continue;
                }
                check = true;
                //c.close();
            } catch (InputMismatchException e) {
                System.out.println("Error! " + e);
            }
        } while (!check);
        Villa villa = new Villa(id, name, area, cost, amount, typeRent, room, f, floor, a);
        villas.add(villa);
        return villas;
    }

    public List<House> addNewHouse() {
        String name = "", type = "", room = "", f = "", id = "";
        double area = 0, cost = 0, a = 0;
        int amount = 0, floor = 0;
        boolean check = false;
        id = UUID.randomUUID().toString().replace("-", "");
        do {
            Scanner c = new Scanner(System.in);
            try {

                System.out.println("Name Service :");
                name = c.nextLine();
                boolean testName = name.matches(regex);
                if (!testName) {
                    System.out.println(name + " invalid");
                    continue;
                }
                System.out.println("Area : ");
                area = c.nextDouble();
                if (area < 30) {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Cost");
                cost = c.nextDouble();
                if (cost < 0) {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Amount of People : ");
                amount = c.nextInt();
                if (amount < 0 || amount > 20) {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Type of rent :");
                c.nextLine();
                type = c.nextLine();
                boolean testRent = type.matches(regex);
                if (!testRent) {
                    System.out.println(type + "invalid");
                    continue;
                }
                System.out.println("Type of room :");
                room = c.nextLine();
                boolean testRoom = room.matches(regex);
                if (!testRoom) {
                    System.out.println(room + "wrong format");
                    continue;
                }
                System.out.println("other facility :");
                f = c.nextLine();
                if (f.equalsIgnoreCase("condition air") || f.equalsIgnoreCase("television") ||
                        f.equalsIgnoreCase("GYM") || f.equalsIgnoreCase("Bar") ||
                        f.equalsIgnoreCase("Board")) {

                } else {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Floor");
                floor = c.nextInt();
                if (floor < 0) {
                    System.out.println(floor + "invalid");
                    continue;
                }
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Error! " + e);
            }
        } while (!check);
        House house = new House(id, name, area, cost, amount, type, room, f, floor);
        houses.add(house);
        return houses;
    }

    public List<Room> addNewRoom() {
        String name = "", type = "", f = "", id = "";
        double area = 0, cost = 0;
        int amount = 0;
        boolean check = false;
        id = UUID.randomUUID().toString().replace("-", "");
        do {
            Scanner c = new Scanner(System.in);
            try {
                System.out.println("Name Service :");
                name = c.nextLine();
                boolean testName = name.matches(regex);
                if (!testName) {
                    System.out.println(name + " invalid");
                    continue;
                }
                System.out.println("Area : ");
                area = c.nextDouble();
                if (area < 30) {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Cost");
                cost = c.nextDouble();
                if (cost < 0) {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Amount of People : ");
                amount = c.nextInt();
                if (amount < 0 || amount > 20) {
                    System.out.println("invalid");
                    continue;
                }
                System.out.println("Type of rent :");
                c.nextLine();
                type = c.nextLine();
                boolean testRent = type.matches(regex);
                if (!testRent) {
                    System.out.println(type + "invalid");
                    continue;
                }
                System.out.println("other free Service :");
                f = c.nextLine();
                if (f.equalsIgnoreCase("massage") || f.equalsIgnoreCase("karaoke") ||
                        f.equalsIgnoreCase("food") || f.equalsIgnoreCase("drink") ||
                        f.equalsIgnoreCase("car")) {

                } else {
                    System.out.println("invalid");
                    continue;
                }

                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Error! " + e);
            }
        } while (!check);
        Room room = new Room(id, name, area, cost, amount, type, f);
        rooms.add(room);
        return rooms;
    }

    public void readService(int choice) {
        BufferedReader br = null;
        try {
            String line;
            if (choice == 1) {
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Villa.csv"));
            } else if (choice == 2)
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\House.csv"));
            else
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Room.csv"));
            //read file in java line by line.
            int index = 1;
            while ((line = br.readLine()) != null) {
                if (choice == 1)
                    System.out.println(index + " :" + (FuncReadFileCSV.parseCsvLineVilla(line)).showInfor());
                else if (choice == 2)
                    System.out.println(index + " :" + (FuncReadFileCSV.parseCsvLineHouse(line)).showInfor());
                else
                    System.out.println(index + " :" + (FuncReadFileCSV.parseCsvLineRoom(line)).showInfor());
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public TreeSet<Services> readServiceTreeSet(int choice) {
        showService.clear();
        BufferedReader br = null;
        try {
            String line;
            if (choice == 1)
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Villa.csv"));
            else if (choice == 2)
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\House.csv"));
            else
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Room.csv"));
            // How to read file in java line by line?
            int index = 1;
            while ((line = br.readLine()) != null) {
                //System.out.println(index + " : " + FuncReadFileCSV.parseCsvLineRoom(line).showInfor());
                if (choice == 1)
                    showService.add(FuncReadFileCSV.parseCsvLineVilla(line));
                else if (choice == 2)
                    showService.add(FuncReadFileCSV.parseCsvLineHouse(line));
                else
                    showService.add(FuncReadFileCSV.parseCsvLineRoom(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        return showService;
    }

    public void showServiceTreeSet() {
        int index = 1;
        for (Services services : showService
        ) {
            System.out.println(index++ + " : " + services.showInfor());
        }
    }

    public void addNewService(int i) {
        switch (i) {
            case 1:
                String fileName = "D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Villa.csv";
                FuncWriteFileCSV.writeCsvFileVilla(fileName, addNewVilla());
                break;
            case 2:
                String fileName1 = "D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\House.csv";
                FuncWriteFileCSV.writeCsvFileHouse(fileName1, addNewHouse());
                break;
            case 3:
                String fileName2 = "D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Room.csv";
                FuncWriteFileCSV.writeCsvFileRoom(fileName2, addNewRoom());
                break;
            default:
                System.err.println("number invalid");
        }
    }

    public void showService(int i) {
        switch (i) {
            case 1:
                //showVilla();
                readService(1);
                break;
            case 2:
                readService(2);
                //showHouse();
                break;
            case 3:
                readService(3);
                // showRoom();
                break;
            case 4:
                readServiceTreeSet(1);
                showServiceTreeSet();
                break;
            case 5:
                readServiceTreeSet(2);
                showServiceTreeSet();
                break;
            case 6:
                readServiceTreeSet(3);
                showServiceTreeSet();
                break;
            default:
                System.out.println("number invalid");
        }

    }

    public void showCustomer() {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Customer.csv"));
            // How to read file in java line by line?
            sortCustomer.clear();
            while ((line = br.readLine()) != null) {
                sortCustomer.add((FuncReadFileCSV.parseCsvLineCustomer(line)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        Collections.sort(sortCustomer, new CustomerComparator());
        int index = 1;
        for (Customer c : sortCustomer
        ) {
            System.out.println(index + ":" + c.showInfo());
            index++;
        }
//        FuncWriteFileCSV.writeCsvFileCustomer(fileName, sortCustomer);
    }

    public void showBooking(int choice) {
        BufferedReader br = null;
        try {
            String line;
            if (choice == 1)
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingVilla.csv"));
            else if (choice == 2)
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingHouse.csv"));
            else
                br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingRoom.csv"));
            int index = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(index++ + " : " + (FuncReadFileCSV.parseCsvLineBookingService(line)).showInfoBook());
            }
        } catch (IOException e) {
            System.err.println("Booking file not exist");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public void addNewBooking() {
        Scanner sc = new Scanner(System.in);
        showCustomer();
        System.out.println("choice customer");
        int choiceCustomer = sc.nextInt();
        System.out.println("\n 1.Booking villa" + "\n 2.Booking House" + "\n 3.Booking Room");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                readService(1);
                int choiceVilla;
                do {
                    System.out.println("choice Villa to booking :");
                    choiceVilla = sc.nextInt();
                } while (choiceVilla < 0 || choiceVilla > villas.size());
                Customer customer = sortCustomer.get(choiceCustomer - 1);
                customer.setServices(villas.get(choiceVilla - 1));
                customer.setIdService(customer.getServices().getId());
                customerBookingVilla.add(customer);
                customerTreeSetVilla.add(customer);
                final String fileName1 = "D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingVilla.csv";
                FuncWriteFileCSV.writeCsvFileCustomerBooking(fileName1, customerBookingVilla);
                showBooking(1);
                break;
            case 2:
                readService(2);
                System.out.println("choice House to booking :");
                int choiceHouse = sc.nextInt();
                Customer customerHouse = sortCustomer.get(choiceCustomer - 1);
                customerHouse.setServices(houses.get(choiceHouse - 1));
                customerHouse.setIdService(customerHouse.getServices().getId());
                customerBookingHouse.add(customerHouse);
                customerTreeSetHouse.add(customerHouse);
                final String fileName2 = "D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingHouse.csv";
                FuncWriteFileCSV.writeCsvFileCustomerBooking(fileName2, customerBookingHouse);
                showBooking(2);
                break;
            case 3:
                readService(3);
                System.out.println("choice Room to booking :");
                int choiceRoom = sc.nextInt();
                Customer customerRoom = sortCustomer.get(choiceCustomer - 1);
                customerRoom.setServices(rooms.get(choiceRoom - 1));
                customerRoom.setIdService(customerRoom.getServices().getId());
                customerBookingRoom.add(customerRoom);
                customerTreeSetRoom.add(customerRoom);
                final String fileName3 = "D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingRoom.csv";
                FuncWriteFileCSV.writeCsvFileCustomerBooking(fileName3, customerBookingRoom);
                showBooking(3);
                break;
            default:
                System.out.println("Number invalid");
        }
    }

    public void getAllDataCSV() {

        //get Villa data
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Villa.csv"));
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                villas.add((FuncReadFileCSV.parseCsvLineVilla(line)));
            }
        } catch (IOException e) {
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        //get Room data
        BufferedReader br1 = null;
        try {
            String line;
            br1 = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Room.csv"));
            // How to read file in java line by line?
            while ((line = br1.readLine()) != null) {
                rooms.add(FuncReadFileCSV.parseCsvLineRoom(line));
            }
        } catch (IOException e) {
        } finally {
            try {
                if (br1 != null)
                    br1.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }

        //get House data
        BufferedReader br2 = null;
        try {
            String line;
            br2 = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\House.csv"));
            // How to read file in java line by line?
            while ((line = br2.readLine()) != null) {
                houses.add(FuncReadFileCSV.parseCsvLineHouse(line));
            }
        } catch (IOException e) {

        } finally {
            try {
                if (br2 != null)
                    br2.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        //get customer data
        BufferedReader br3 = null;
        try {
            String line;
            br3 = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\Customer.csv"));
            // How to read file in java line by line?
            while ((line = br3.readLine()) != null) {
                sortCustomer.add((FuncReadFileCSV.parseCsvLineCustomer(line)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br3.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        Collections.sort(sortCustomer, new CustomerComparator());
//        FuncWriteFileCSV.writeCsvFileCustomer(fileName, sortCustomer);
        //get Booking Villa
        BufferedReader br4 = null;
        try {
            String line1;
            br4 = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingVilla.csv"));
            // How to read file in java line by line?
            while ((line1 = br4.readLine()) != null) {
                customerBookingVilla.add(FuncReadFileCSV.parseCsvLineBookingService(line1));
            }
        } catch (IOException e) {

        } finally {
            try {
                if (br4 != null)
                    br4.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
// get Booking House
        BufferedReader br5 = null;
        try {
            String line2;
            br5 = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingHouse.csv"));
            // How to read file in java line by line?
            while ((line2 = br5.readLine()) != null) {
                customerBookingHouse.add(FuncReadFileCSV.parseCsvLineBookingService(line2));
            }
        } catch (IOException e) {
        } finally {
            try {
                if (br5 != null)
                    br5.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }

        //get bookingroom
        BufferedReader br6 = null;
        try {
            String line;
            br6 = new BufferedReader(new FileReader("D:\\CodeGym\\Module2\\CaseStudy\\src\\data\\BookingRoom.csv"));
            // How to read file in java line by line?
            while ((line = br6.readLine()) != null) {
                customerTreeSetRoom.add(FuncReadFileCSV.parseCsvLineBookingService(line));
            }
        } catch (IOException e) {

        } finally {
            try {
                if (br6 != null)
                    br6.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }

    }

    public void DisplayMainMenu() {
        getAllDataCSV();
        boolean stop = false;
        boolean stop1 = false;
        boolean stop2 = false;
        addEmployye();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Add new Service " + "\n2. Show Service " + "\n3. Add new Customer" + "\n4. Show Customer" +
                    "\n5. Add New Booking Resort " + "\n6. Show Customer " + "\n7. pick ticked Cinema4D" + "\n8. Show customer pick ticked" + "\n9. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("1. Add new Villa " + "\n2. Add new House" +
                                "\n3. Add new Room" + "\n4. Back" + "\n5. Exit");
                        int choice1 = sc.nextInt();
                        if (choice1 == 4) {
                            stop1 = true;
                            break;
                        } else if (choice1 == 5) {
                            stop = true;
                            stop1 = true;
                            break;
//                            System.exit(0);
                        } else
                            addNewService(choice1);
                    } while (!stop1);
                    break;
                case 2:
                    do {
                        System.out.println("1. Show All Villa " + "\n2. Show All House" +
                                "\n3. Show All Room" + "\n4. Show All Name Villa Not Duplicate" +
                                "\n5. Show All Name House Not Duplicate" + "\n6. Show All Name Name Not Duplicate "
                                + "\n7.Back" + "\n8.Exit");
                        int choice1 = sc.nextInt();
                        if (choice1 == 7) {
                            stop2 = true;
                            break;
                        } else if (choice1 == 8) {
                            stop = true;
                            stop2 = true;
                        } else
                            showService(choice1);
                    } while (!stop2);
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    displayEmployee(addEmployye());
                case 7:
                    cinema4D();
                    break;
                case 8:
                    showCustomerInCinema();
                    break;
                case 9:
                    stop = true;
                    break;
            }
        } while (!stop);
    }

    public void displayEmployee(Map map) {
        Set set = map.keySet();
        for (Object o : set) {
            System.out.println(o + "  " + map.get(o));
        }
    }

    public void cinema4D() {
        int index = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            showCustomer();
            System.out.println("press 100 to exit");
            System.out.println("pick customer for seat :" + index++);
            int choice = scanner.nextInt();
            if (choice == 100) {
            } else {
                ciname4D.add(sortCustomer.get(choice-1));
            }
        } while (index < sortCustomer.size());

    }

    public void showCustomerInCinema() {
        if (ciname4D == null) {
            System.out.println("None");
        } else {
            for (Customer customer : ciname4D) {
                System.out.println(customer.showInfo());
            }
        }

    }


    public static void main(String[] args) {
        MainController m = new MainController();
        m.DisplayMainMenu();

    }
}
