package org.javatpoint.service;

import org.javatpoint.model.Employee;
import org.springframework.stereotype.Service;

/**
 * @author Brad Shih on 2023/7/3
 * @project aop-before-advice-example
 */
@Service
public class EmployeeService
{
    public Employee createEmployee(String empId, String fname, String sname)
    {
        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(fname);
        emp.setSecondName(sname);
        return emp;
    }
    public void deleteEmployee(String empId)
    {
    }
}
