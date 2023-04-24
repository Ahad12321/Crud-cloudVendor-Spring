package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
        //new CloudVendor("C1","Vendor 1", "Adress one","xxxxx");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor deleted Successfully";
    }


}
