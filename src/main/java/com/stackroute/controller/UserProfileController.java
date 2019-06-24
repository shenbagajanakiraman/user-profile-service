package com.stackroute.controller;



import com.stackroute.service.BookedService;
import com.stackroute.service.ListedService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-mgmt-api/v1")
public class UserProfileController {

   BookedService bookedService;
   ListedService listedService;

   @Autowired
  public UserProfileController(BookedService bookedService, ListedService listedService) {
    this.bookedService = bookedService;
    this.listedService = listedService;
  }


  @PostMapping(/book) 
}
