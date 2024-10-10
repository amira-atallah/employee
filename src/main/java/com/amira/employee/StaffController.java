package com.amira.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class StaffController {

    List<Staff> allStaff = new ArrayList<>();



    @GetMapping("/")
    public String addStaff(Model model) {
        model.addAttribute("staff", new Staff());
        return "addstaff";
    }

    @PostMapping("/submit")
    public String submit(Staff staff) {
        allStaff.add(staff);
         return "redirect:/getallstaff";
    }

    @GetMapping("/getallstaff")
    public String listStaffDetails(Model model) {
        model.addAttribute("allStaff", allStaff);
        return "getallstaff"; // Return the name of the view as a string
    }
}

