package com.example.springsematec.service;

import com.example.springsematec.exception.Notfound;
import com.example.springsematec.model.kargar;
import com.example.springsematec.repository.kargarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class kargarservice {
    @Autowired
    kargarRepository repository;




    public List<kargar> getAllEmployees()
    {
        List<kargar> employeeList = repository.findAll();

        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<kargar>();
        }
    }





    public kargar getEmployeeById(Long id) throws Notfound
    {
        Optional<kargar> employee = repository.findById(id);

        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new Notfound("No employee record exist for given id");
        }
    }
}
