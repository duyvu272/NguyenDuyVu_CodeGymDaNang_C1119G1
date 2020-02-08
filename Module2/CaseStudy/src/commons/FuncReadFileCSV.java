package commons;

import models.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class FuncReadFileCSV {
    private static final String COMMA_DELIMITER = ","; // Split by comma

    public static Villa parseCsvLineVilla(String csvLine) {
        Villa v = new Villa();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            v.setId(splitData[0]);
            v.setNameService(splitData[1]);
            v.setArea(Double.parseDouble(splitData[2]));
            v.setCost(Double.parseDouble(splitData[3]));
            v.setAmountPeople(Integer.parseInt(splitData[4]));
            v.setTypeRent(splitData[5]);
            v.setTypeOfRoom(splitData[6]);
            v.setOtherFacility(splitData[7]);
            v.setFloor(Integer.parseInt(splitData[8]));
            v.setAreaPool(Double.parseDouble(splitData[9]));
        }
        return v;
    }
    public static House parseCsvLineHouse(String csvLine) {
        House house = new House();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            house.setId(splitData[0]);
            house.setNameService(splitData[1]);
            house.setArea(Double.parseDouble(splitData[2]));
            house.setCost(Double.parseDouble(splitData[3]));
            house.setAmountPeople(Integer.parseInt(splitData[4]));
            house.setTypeRent(splitData[5]);
            house.setTypeOfRoom(splitData[6]);
            house.setOtherFacility(splitData[7]);
            house.setFloor(Integer.parseInt(splitData[8]));
        }
        return house;

    }

    public static Room parseCsvLineRoom(String csvLine) {
        Room room = new Room();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            room.setId(splitData[0]);
            room.setNameService(splitData[1]);
            room.setArea(Double.parseDouble(splitData[2]));
            room.setCost(Double.parseDouble(splitData[3]));
            room.setAmountPeople(Integer.parseInt(splitData[4]));
            room.setTypeRent(splitData[5]);
            room.setOtherFreeService(splitData[6]);
        }
        return room;

    }

    public static Customer parseCsvLineCustomer(String csvLine) {
        Customer customer = new Customer();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            customer.setName(splitData[0]);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dayOfBirth = null;
            try {
                dayOfBirth = dateFormat.parse(splitData[1]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            customer.setBirthOfDay(dayOfBirth);
            customer.setGender(splitData[2]);
            customer.setId(splitData[3]);
            customer.setPhone((splitData[4]));
            customer.setEmail(splitData[5]);
            customer.setMemberShip(splitData[6]);
            customer.setAddress(splitData[7]);
        }
        return customer;

    }

    public static Customer parseCsvLineBookingService(String csvLine) {
        Customer customer = new Customer();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            customer.setName(splitData[0]);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dayOfBirth = null;
            try {
                dayOfBirth = dateFormat.parse(splitData[1]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            customer.setBirthOfDay(dayOfBirth);
            customer.setGender(splitData[2]);
            customer.setId(splitData[3]);
            customer.setPhone((splitData[4]));
            customer.setEmail(splitData[5]);
            customer.setMemberShip(splitData[6]);
            customer.setAddress(splitData[7]);
            customer.setIdService(splitData[8]);
        }
        return customer;
    }

}
