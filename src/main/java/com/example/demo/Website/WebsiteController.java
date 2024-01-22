package com.example.demo.Website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WebsiteController {

    @Autowired
    private WebsiteService websiteService;


    @GetMapping(value = "get_all_websites")
    public List<Website> getAllWebsites() {
        return websiteService.getAllWebsites();
    }


    @PostMapping(value = "add_website")
    public Website addWebsite(@RequestBody String url) {
        return websiteService.addWebsite(url);
    }

    @GetMapping(value = "get_all_websites_updated_status")
    public List<Website> getAllWebsitesStatus() {
        return websiteService.updateWebsiteStatus();
    }

}
