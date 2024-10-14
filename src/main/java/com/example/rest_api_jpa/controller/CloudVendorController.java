package com.example.rest_api_jpa.controller;

import com.example.rest_api_jpa.model.CloudVendor;
import com.example.rest_api_jpa.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    // GET Method,     http://localhost:8087/cloudvendor/C1
//    @GetMapping("{vendorId}")
//    public CloudVendor getCloudVendorDetails(String vendorId){

//        return new CloudVendor("C1", "Vendor 1", "Address One", "1231231231");

//    }


    // POST Method,       http://localhost:8087/cloudvendor
//    CloudVendor cloudVendor;
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    // Read Specific Cloud Vendor details from Database
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        return cloudVendorService.getCloudVendor(vendorId);
    }

    // Read All Cloud Vendor details from Database
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){

        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    // PUT Method
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    // Delete Method
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }

}
