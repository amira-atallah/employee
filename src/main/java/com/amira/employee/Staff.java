package com.amira.employee;

public class Staff {

    private String staffName;
    private String staffEmail;
    private String staffPhone;
    private String staffDepartment;
    private String staffSalary;

    public Staff(String staffName, String staffEmail, String staffPhone, String staffDepartment, String staffSalary) {
        this.staffName = staffName;
        this.staffEmail = staffEmail;
        this.staffPhone = staffPhone;
        this.staffDepartment = staffDepartment;
        this.staffSalary = staffSalary;
    }

    public Staff() {

    }


    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getStaffEmail() {
        return staffEmail;
    }
    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }
    public String getStaffPhone() {
        return staffPhone;
    }
    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }
    public String getStaffDepartment() {
        return staffDepartment;
    }
    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }
    public String getStaffSalary() {
        return staffSalary;
    }
    public void setStaffSalary(String staffSalary) {
        this.staffSalary = staffSalary;
    }

}
