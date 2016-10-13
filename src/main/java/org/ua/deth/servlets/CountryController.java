package org.ua.deth.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.ua.deth.dao.service.CountryService;
import org.ua.deth.entitys.Country;

import javax.servlet.http.HttpSession;

@Controller
public class CountryController {

    final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @RequestMapping(value = "/country.html", method = RequestMethod.GET)
    public String getPage() {
        return "addCountry";
    }

    @RequestMapping(value = "addCountry", method = RequestMethod.POST)
    public String addCountry(@RequestParam("countryName") String countryName, Model model, HttpSession session) {
        Country country = new Country();
        country.setName(countryName);
        countryService.createCountry(country);
        session.setAttribute("countries", countryService.showCountries());
        return "redirect:country.html";
    }

    @RequestMapping(value = "showCountries", method = RequestMethod.GET)
    public String showCountries(HttpSession session) {
        session.setAttribute("countries", countryService.showCountries());
        return "redirect:country.html";
    }
}
