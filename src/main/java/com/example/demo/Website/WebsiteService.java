package com.example.demo.Website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class WebsiteService {
    @Autowired
    private WebsiteRepo websiteRepo;

    public List<Website> getAllWebsites() {
        return websiteRepo.findAll();
    }

    public Website addWebsite(String url) {
        Website website=new Website();
        website.setUrl(url);
        website.setStatus(false);
        websiteRepo.save(website);
        return website;
    }
    public List<Website> updateWebsiteStatus() {
        List<Website> websites=websiteRepo.findAll();
        for (Website website : websites) {
            website.setStatus(isWebsiteDown(website.getUrl()));
            websiteRepo.save(website);
        }
        return websites;
    }
    public static boolean isWebsiteDown(String url) {
        try {
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            return responseCode == 200;
        } catch (Exception e) {
            return false;
        }
    }
}
