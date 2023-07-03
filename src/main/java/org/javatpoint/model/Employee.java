package org.javatpoint.model;

/**
 * @author Brad Shih on 2023/7/3
 * @project aop-before-advice-example
 */
public class Employee {
    private String empId;
    private String firstName;
    private String secondName;
    //default constructor
    public Employee()
    {
    }
    public String getEmpId()
    {
        return empId;
    }
    public void setEmpId(String empId)
    {
        this.empId = empId;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getSecondName()
    {
        return secondName;
    }
    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }
}
