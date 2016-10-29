package org.ua.deth.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
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
    public ModelAndView getPage(ModelAndView modelAndView) {
        Country country = new Country();
        modelAndView.addObject("countries", countryService.showCountries());
        modelAndView.addObject("countryForm", country);
        modelAndView.setViewName("addCountry");
        return modelAndView;
    }

    //try to add Spring form:tag
    @RequestMapping(value = "addCountry", method = RequestMethod.POST)
    public String addCountry(@ModelAttribute("countryForm") Country country, HttpSession session) {
        countryService.createCountry(country);
        session.setAttribute("countries", countryService.showCountries());
        return "redirect:country.html";
    }

    @RequestMapping(value = "removeCountry", method = RequestMethod.POST)
    public ModelAndView removeCountry(@RequestParam("countryId") String countryId) {
        ModelAndView modelAndView = new ModelAndView();
        countryService.removeCountry(Long.parseLong(countryId));
        modelAndView.addObject("countries", countryService.showCountries());
        modelAndView.setViewName("redirect:country.html");
        return modelAndView;
    }

    @RequestMapping(value = "showCountries", method = RequestMethod.GET)
    public ModelAndView showCountries(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        session.setAttribute("showCountries", countryService.showCountries());
        modelAndView.setViewName("redirect:country.html");
        return modelAndView;
    }

    @RequestMapping(value = "editCountry", method = RequestMethod.POST)
    public ModelAndView editCountry(@RequestParam("countryId") String countryId, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        session.setAttribute("editedCountry", countryService.showById(Long.parseLong(countryId)));
        modelAndView.setViewName("redirect:edit_country.html");
        return modelAndView;
    }

    @RequestMapping(value = "edit_country.html", method = RequestMethod.GET)
    public ModelAndView getEditCountryPage(ModelAndView modelAndView, HttpSession session) {
        modelAndView.setViewName("editCountry");
        return modelAndView;
    }

    @RequestMapping(value = "doEditCountry", method = RequestMethod.POST)
    public ModelAndView doEditCountry(HttpSession session, @RequestParam("name") String name) {
        ModelAndView modelAndView = new ModelAndView();
        session.setAttribute("showCountries", countryService.showCountries());
        Country country = (Country) session.getAttribute("editedCountry");
        country.setName(name);
        countryService.updateCountry(country);
        modelAndView.setViewName("redirect:country.html");
        return modelAndView;
    }


}
