package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

@Repository
public class CentreDAO
{
    private static Centres list = new Centres();

    static
    {
        list.getCentreList().add(new Centre(1, "Excell", "50", "9876543210", "excellinstudy@gmail.com", "Ganesh Apartment, Sector 4, Noida, Uttar Pradesh, pincode : 198111"));
        list.getCentreList().add(new Centre(2, "Booster", "75", "9879876781", "boosterprep@gmail.com", "Flat 7, Gokuldham Society, Navi Mumbai, Maharashtra, pincode : 187710"));
        list.getCentreList().add(new Centre(3, "Academia", "100", "9871234568", "academiajunior@gmail.com", "Room 5, Ram Villa, Gandhinagar, Gujarat, pincode : 334119"));
    }

    public Centres getAllCentres()
    {
        return list;
    }

    public void addCentre(Centre centre) {
        list.getCentreList().add(centre);
    }
}
